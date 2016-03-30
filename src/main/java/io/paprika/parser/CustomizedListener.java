package io.paprika.parser;


import io.paprika.model.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.neo4j.cypher.internal.compiler.v2_2.functions.Str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sarra on 24/03/2016.
 */
public class CustomizedListener extends ObjCBaseListener {

    ObjCParser parser;
    PaprikaApp app;
    private ArrayList<PaprikaClass> classes;
    private ArrayList<PaprikaExternalClass> externalClasses;
    private ArrayList<PaprikaMethod> methods;
    private ArrayList<PaprikaVariable> variables;
    private ArrayList<PaprikaArgument> arguments;
    private ArrayList<PaprikaExternalMethod> externalMethods;
    private ArrayList<PaprikaExternalArgument> externalArguments;
    PaprikaClass currentClass;
    PaprikaMethod currentMethod;

    public CustomizedListener(ObjCParser parser) {
        this.parser = parser;
        this.app = PaprikaApp.createPaprikaApp("UnknownApp");
        this.classes = new ArrayList<PaprikaClass>();
        this.methods = new ArrayList<PaprikaMethod>();
        this.variables = new ArrayList<PaprikaVariable>();
        this.arguments = new ArrayList<PaprikaArgument>();
        this.externalArguments = new ArrayList<PaprikaExternalArgument>();
        this.externalClasses = new ArrayList<PaprikaExternalClass>();
        this.externalMethods = new ArrayList<PaprikaExternalMethod>();
        currentClass = null;
        currentMethod = null;

    }
    @Override public void enterClass_implementation(@NotNull ObjCParser.Class_implementationContext ctx) {
        ObjCParser.Class_nameContext class_nameContext= ctx.class_name();
        insertClass(class_nameContext.IDENTIFIER().getText());

    }


    @Override public void enterFunction_definition(@NotNull ObjCParser.Function_definitionContext ctx) {
        String name="";
        String returnType="";
        HashMap<Integer, String> args;
        //Getting the return type
        if (ctx.declaration_specifiers() != null){
            for (ObjCParser.Type_specifierContext tsc : ctx.declaration_specifiers().type_specifier())
            {
                returnType = tsc.getText();

            }

        }

        //Getting the arguments

        if((args=getParameters(ctx.declarator())) == null){
            args = new HashMap<Integer, String>(0);
        }

        //Getting the function name
        name = getIdentifier(ctx.declarator()).IDENTIFIER().toString()+ ":";
        this.insertMethod(name, returnType, true, true, args);
    }

    @Override public void enterInstance_method_definition(@NotNull ObjCParser.Instance_method_definitionContext ctx) {
        String name="";
        HashMap<Integer, String> args = new HashMap<Integer, String>(0);
        ObjCParser.Method_selectorContext ms =ctx.method_definition().method_selector();
        ObjCParser.SelectorContext sc = ms.selector();
        // System.out.println("voilà la valeur de sc :" + sc);
        int position = 0 ;



        if (sc != null)
        {TerminalNode tn = sc.IDENTIFIER();
            name = (tn.toString()).concat(":");
        }else {

            for (ObjCParser.Keyword_declaratorContext k : ms.keyword_declarator()) {
                // The case of compound method name
                if (k.selector() != null) {
                    name=name.concat(k.selector().IDENTIFIER().toString()+":");
                }
                args.put(position, k.method_type(0).type_name().getText());
                position++ ;
            }

        }

        String returnType =  ctx.method_definition().method_type().type_name().getText();
        this.insertMethod(name, returnType, false , false , args);
    }

    @Override public void enterClass_method_definition(@NotNull ObjCParser.Class_method_definitionContext ctx) {
        String name="";
        HashMap<Integer, String> args = new HashMap<Integer, String>(0);
        ObjCParser.Method_selectorContext ms =ctx.method_definition().method_selector();
        ObjCParser.SelectorContext sc = ms.selector();
        // System.out.println("voilà la valeur de sc :" + sc);
        int position = 0 ;



        if (sc != null)
        {TerminalNode tn = sc.IDENTIFIER();
            name = (tn.toString()).concat(":");
        }else {

            for (ObjCParser.Keyword_declaratorContext k : ms.keyword_declarator()) {
                //System.out.println(" voila un paramètre : "+ k.IDENTIFIER());
                // The case of compound method name
                if (k.selector() != null) {
                    name=name.concat(k.selector().IDENTIFIER().toString()+":");
                }
                args.put(position, k.method_type(0).type_name().getText());
                position++ ;
            }

        }

        String returnType =  ctx.method_definition().method_type().getText();
        this.insertMethod(name, returnType, false , true , args);
    }

    @Override public void enterInit_declarator_list(@NotNull ObjCParser.Init_declarator_listContext ctx) {
        //System.out.println(" --- Entered init_declarator_list --- ");
    }


    ObjCParser.IdentifierContext getIdentifier(ObjCParser.DeclaratorContext declaratorContext){
        ObjCParser.Direct_declaratorContext direct_declaratorContext = declaratorContext.
                direct_declarator();
        if(direct_declaratorContext.identifier() !=null)
        {
            return direct_declaratorContext.identifier();
        }else if (direct_declaratorContext.declarator() != null){
            return (this.getIdentifier(direct_declaratorContext.declarator()));
        }else {
            return null;
        }
    }






    public PaprikaClass insertClass(String name) {
        boolean classExists= false;
        PaprikaClass c= null;
        for (PaprikaClass cl : this.classes){
            if((cl.getName()).equals(name)){
                classExists=true;
                c= cl;
            }
        }
        if(classExists == false) {
            c = PaprikaClass.createPaprikaClass(name, app);
            classes.add(c);
        }
        currentClass = c;
        return c;
    }

    public void insertMethod(String name,  String returnType, boolean isFunction, boolean isStatic, HashMap<Integer, String> args) {
        PaprikaMethod m = PaprikaMethod.createPaprikaMethod(name, returnType, currentClass, isFunction, isStatic);
        for( HashMap.Entry<Integer, String> pair: args.entrySet()){
            PaprikaArgument.createPaprikaArgument(pair.getValue(), pair.getKey(), m);
        }
        methods.add(m);
    }


    public void printModel()
    {
        for(PaprikaClass c: classes){
            System.out.println("La classe "+ c.getName());
            for (PaprikaVariable v: c.getPaprikaVariables()){
                System.out.println("++ Variable: "+v.getName()+" type: "+v.getType()+" modfier "+ v.getModifier() );
            }
            for(String inter : c.getInterfacesNames()){
                System.out.println(":: Implements interface : "+ inter );
            }
            for(PaprikaMethod m : c.getPaprikaMethods())
            {
                System.out.println("Methode: "+m.getName()+" RType: "
                        + m.getReturnType() + " fonction: "+ m.getFunction()+
                        " statique: "+ m.getStatic() );
                for(PaprikaArgument arg : m.getArguments())
                {
                    System.out.println("--Arg: " + arg.getName() + " position: "+arg.getPosition());
                }
            }
        }
    }

    public String getType(ObjCParser.Declaration_specifiersContext declaration_specifiersContext){
        String type="";
        if(declaration_specifiersContext.type_specifier()!= null)
        {
            type= declaration_specifiersContext.type_specifier(0).getText();
        }
        return  type;
    }

    HashMap<Integer, String> getParameters(ObjCParser.DeclaratorContext declaratorContext){

        if(declaratorContext.direct_declarator().block_parameters() != null){

        }else{
            if(declaratorContext.direct_declarator().declarator_suffix() == null ){
                if (declaratorContext.direct_declarator().declarator() == null){
                    return null;
                }else{
                    return getParameters(declaratorContext.direct_declarator().declarator());
                }
            }else{
                if(declaratorContext.direct_declarator().declarator_suffix(0).parameter_list() != null){
                    List<ObjCParser.Parameter_declarationContext> plist = declaratorContext.
                            direct_declarator().declarator_suffix(0).parameter_list().
                            parameter_declaration_list().parameter_declaration();
                    HashMap<Integer,String> args = new HashMap<Integer,String>(0);
                    int position = 0;
                    for (ObjCParser.Parameter_declarationContext pd : plist){
                        args.put(position,getType(pd.declaration_specifiers()) );
                        position++;
                    }
                    return args;

                }else{
                    return null;
                }
            }
        }

       return null;
    }

    @Override public void enterInstance_variables(@NotNull ObjCParser.Instance_variablesContext ctx) {
        PaprikaModifiers modifier = PaprikaModifiers.PROTECTED;
        //ArrayList<String> types= new ArrayList<String>(0);
       // ArrayList <String> names= new ArrayList<String>(0);
        String type="";
        String name="";
        if(ctx.visibility_specification()!=null){
            switch (ctx.visibility_specification().getText()){
                case "@private": {
                    modifier = PaprikaModifiers.PRIVATE;
                    break;
                }

                case "@protected": {
                    modifier = PaprikaModifiers.PROTECTED;
                    break;
                }
                case "@public": {
                    modifier = PaprikaModifiers.PUBLIC;
                    break;
                }
                case "@property": {
                    modifier = PaprikaModifiers.PRIVATE;
                    break;
                }
                    //variables declared with @package are considered public
                case  "@package": {
                    modifier = PaprikaModifiers.PUBLIC;
                    break;
                }
            }
        }

        if (ctx.struct_declaration()!=null){
            List<ObjCParser.Struct_declarationContext> list = ctx.struct_declaration();
            for(ObjCParser.Struct_declarationContext declaration : list){
                // Getting the type
                type="";
                for(ObjCParser.Type_specifierContext t: declaration.specifier_qualifier_list().type_specifier()){
                    type=type.concat(t.getText());

                }


                //Getting the name

                for(ObjCParser.Struct_declaratorContext struct_declarator: declaration.
                        struct_declarator_list().struct_declarator()){
                    if(struct_declarator.declarator()!=null){
                        name = getIdentifier(struct_declarator.declarator()).getText();
                        PaprikaVariable.createPaprikaVariable(name,type , modifier, currentClass);
                    }else{
                        // @TODO: Le cas d'une constante

                    }

                }
            }
        }
    }

    @Override public void enterClass_interface(@NotNull ObjCParser.Class_interfaceContext ctx) {
        ObjCParser.Class_nameContext class_nameContext= ctx.class_name();
        insertClass(class_nameContext.IDENTIFIER().getText());

        //handling the protocols
        if(ctx.protocol_reference_list() != null){
            handleProtocols(ctx.protocol_reference_list());
        }

    }

    @Override public void enterProperty_declaration(@NotNull ObjCParser.Property_declarationContext ctx) {
        String type ="";
        String name="";
        PaprikaModifiers modifier = PaprikaModifiers.PRIVATE;
        // Getting the type

        for(ObjCParser.Type_specifierContext t: ctx.struct_declaration().specifier_qualifier_list().type_specifier()){
            type=type.concat(t.getText());

        }
        List<ObjCParser.Struct_declaratorContext> list = ctx.struct_declaration().struct_declarator_list().struct_declarator();
        for(ObjCParser.Struct_declaratorContext declaration : list){
            //Getting the name

                if(declaration.declarator()!=null){
                    name = getIdentifier(declaration.declarator()).getText();
                    PaprikaVariable.createPaprikaVariable(name,type , modifier, currentClass);
                }else{
                    // @TODO: Le cas d'une constante

                }


        }
    }
    @Override public void enterImplementation_definition_list(@NotNull ObjCParser.Implementation_definition_listContext ctx) {
        for(ObjCParser.DeclarationContext declaration : ctx.declaration()){
            handleDeclaration(declaration);
        }
    }

    @Override public void enterInterface_declaration_list(@NotNull ObjCParser.Interface_declaration_listContext ctx) {
        for(ObjCParser.DeclarationContext declaration : ctx.declaration()){
            handleDeclaration(declaration);
        }
    }


    //Global variables
    public void handleDeclaration(@NotNull ObjCParser.DeclarationContext ctx) {
        ObjCParser.Declaration_specifiersContext specifiers = ctx.declaration_specifiers();
        ObjCParser.Init_declarator_listContext list = ctx.init_declarator_list();
        boolean isExtern = false;
        PaprikaModifiers modifier = PaprikaModifiers.PRIVATE;
        String type = "";
        String name = "";
        //Checking if the variable is extern
        if(specifiers.storage_class_specifier() != null){
            for(ObjCParser.Storage_class_specifierContext spec : specifiers.storage_class_specifier()){
                if(spec.getText().equals("extern")){
                    isExtern = true;
                }
                System.out.println("Extern variable");
            }
        }
        if(isExtern){
            modifier = PaprikaModifiers.PUBLIC;
        }
        //Getting the type
        if(specifiers.type_specifier() != null){
            for(ObjCParser.Type_specifierContext t : specifiers.type_specifier()){
                type = type.concat(t.getText());
            }
        }

        //Getting the variable(s)
        if(list != null){
            for(ObjCParser.Init_declaratorContext declarator : list.init_declarator()){
                name = getIdentifier(declarator.declarator()).IDENTIFIER().getText();
                PaprikaVariable.createPaprikaVariable(name, type, modifier, currentClass);
            }
        }
    }

    public void handleProtocols(ObjCParser.Protocol_reference_listContext protocol_reference_list){
        for(ObjCParser.Protocol_nameContext name : protocol_reference_list.protocol_list().protocol_name()){
            currentClass.addInterfaceName(name.IDENTIFIER().getText());
        }
    }

    @Override public void enterCategory_interface(@NotNull ObjCParser.Category_interfaceContext ctx) {
        ObjCParser.Class_nameContext class_nameContext= ctx.class_name();
        String className= class_nameContext.IDENTIFIER().getText();
        if (ctx.category_name()!= null) {
            className = className.concat("+"+ctx.category_name().IDENTIFIER().getText());
        }

        insertClass(className);

        //handling the protocols
        if(ctx.protocol_reference_list() != null){
            handleProtocols(ctx.protocol_reference_list());
        }
    }

    @Override public void enterCategory_implementation(@NotNull ObjCParser.Category_implementationContext ctx) {
        ObjCParser.Class_nameContext class_nameContext= ctx.class_name();
        String className= class_nameContext.IDENTIFIER().getText();
        if (ctx.category_name()!= null) {
            className = className.concat("+"+ctx.category_name().IDENTIFIER().getText());
        }

        insertClass(className);
    }

    @Override public void enterProtocol_declaration(@NotNull ObjCParser.Protocol_declarationContext ctx) {
        PaprikaClass c = insertClass(ctx.protocol_name().IDENTIFIER().getText());
        c.setInterface(true);

        //handling the protocols
        if(ctx.protocol_reference_list() != null){
            handleProtocols(ctx.protocol_reference_list());
        }

        //Methods' declarations retrieval
        if(ctx.interface_declaration_list() != null){
            for (ObjCParser.Interface_declaration_listContext declaration : ctx.interface_declaration_list()){
                if(declaration.class_method_declaration()!= null){
                    // handle class methods
                    for(ObjCParser.Class_method_declarationContext method : declaration.class_method_declaration()){

                    }
                }
                if(declaration.instance_method_declaration()!= null){
                    //handle instance methods
                    for(ObjCParser.Instance_method_declarationContext method: declaration.instance_method_declaration()){
                        
                    }
                }
            }
        }
    }


}

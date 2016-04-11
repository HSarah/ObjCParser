package io.paprika.analyzer;

import io.paprika.model.*;

import java.util.ArrayList;

/**
 * Created by Sarra on 24/03/2016.
 */
public class Analyzer {
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

    public Analyzer() {
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

    public void insertClass(String name) {

        PaprikaClass c = PaprikaClass.createPaprikaClass(name, app);
        classes.add(c);
        currentClass = c;
    }

    public void insertMethod(String name,  String returnType, boolean isFunction, boolean isStatic) {
        PaprikaMethod m = PaprikaMethod.createPaprikaMethod(name, returnType, currentClass, isFunction, isStatic);
        methods.add(m);
        currentMethod = m;
    }

    /*public void insertArgument(String name, int position)
    {
        PaprikaArgument.createPaprikaArgument(name, position, currentMethod);
       // System.out.println("parameter inserted !!");

    }*/

    public void printModel()
    {
        for(PaprikaClass c: classes){
            System.out.println("La classe "+ c.getName());
            for(PaprikaMethod m : c.getPaprikaMethods())
            {
                System.out.println("Methode: "+m.getName()+" RType: "
                        + m.getReturnType() + " fonction: "+ m.getFunction()+
                        " statique: "+ m.getStatic() );
                for(PaprikaArgument arg : m.getArguments())
                {
                    System.out.println("----Arg: " + arg.getArgumentName()+" type: "+arg.getName() + " position: "+arg.getPosition());
                }
            }
        }
    }

}



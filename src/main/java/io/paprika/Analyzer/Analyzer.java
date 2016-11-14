package io.paprika.analyzer;

import io.paprika.model.PaprikaApp;
import io.paprika.neo4j.*;
import io.paprika.parser.ObjCLexer;
import io.paprika.parser.ObjCParser;
import io.paprika.parser.ThrowingErrorListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import scala.reflect.internal.Trees;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.HashMap;

/**
 * Created by Sarra on 27/02/2016.
 */

public class Analyzer {

    HashMap<String,String> filesContents;
    public static String fileName =null ;
    HashMap<String,String> headersContents;
    public Analyzer(){
        filesContents = new HashMap<>();
        headersContents = new HashMap<>();
    }
    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }

    public void parse(final File folder,  String appName,String category, String appKey) throws IOException {
        ObjCLexer lexer;
        CommonTokenStream tokens;
        ObjCParser parser;
        ParseTreeWalker walker;
        ParseTree tree;
        PaprikaApp app =PaprikaApp.createPaprikaApp(appName, category, appKey);
        ModelGenerator modelGenerator = new ModelGenerator(app);
        listFilesForFolder(folder);
        String fileContent;
        //AstPrinter astPrinter = new AstPrinter();
        //analyzing the .m files
        for(String  name: this.filesContents.keySet()){
            fileName = name;
            fileContent = this.filesContents.get(name);
            lexer = new ObjCLexer(new ANTLRInputStream(fileContent));
            tokens = new CommonTokenStream(lexer);
            parser = new ObjCParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
           // try{
                tree =parser.translation_unit();
                //astPrinter.print((RuleContext) tree);
                walker = new ParseTreeWalker();
                walker.walk(modelGenerator, tree);
         /*   }catch(Exception e){
                System.out.println("The file : "+ name);
                System.out.println(e.getMessage());
            }*/

            //modelGenerator.printModel();
            modelGenerator.reInit();
        }
        //analyzing the .h files
        for(String name : this.headersContents.keySet()){
            fileContent = this.headersContents.get(name);
            fileName = name;
           // try{
                lexer = new ObjCLexer(new ANTLRInputStream(fileContent));
                tokens = new CommonTokenStream(lexer);
                parser = new ObjCParser(tokens);
                parser.removeErrorListeners();
                parser.addErrorListener(ThrowingErrorListener.INSTANCE);
                tree =parser.translation_unit();
                walker = new ParseTreeWalker();
                walker.walk(modelGenerator, tree);
           /* }catch(ParseCancellationException e){
                System.out.println("The file : "+ name);
                System.out.println(e.getMessage());
                e.printStackTrace();
                if (e.getCause() instanceof RecognitionException) {
                    RecognitionException re = (RecognitionException)e.getCause();
                    ParserRuleContext context = (ParserRuleContext)re.getCtx();
                    System.out.println("TEXT : "+context.getText());
                    re.printStackTrace();
                }
            }*/

            modelGenerator.reInit();
        }

        GraphsGenerator graphsGenerator = new GraphsGenerator(modelGenerator.getApp());
        graphsGenerator.buildGraph();
        //graphsGenerator.printGraph();
        //modelGenerator.printModel();
        MetricsCalculator.calculateAppMetrics(modelGenerator.getApp());
        ModelToGraph modelToGraph = new ModelToGraph("BDD-test");
        modelToGraph.insertApp(modelGenerator.getApp());


    }


    public void identifyLMFuzzy(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            LMQuery.createLMQuery(queryEngine).executeFuzzy(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }
    public void identifyBLOB(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            BLOBQuery.createBLOBQuery(queryEngine).execute(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }

    public void identifyBLOBFuzzy(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            BLOBQuery.createBLOBQuery(queryEngine).executeFuzzy(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }

    public void identifyLM(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            LMQuery.createLMQuery(queryEngine).execute(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }



    public void identifySAK(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            SAKQuery.createSAKQuery(queryEngine).execute(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }

    public void identifySAKFuzzy(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            SAKQuery.createSAKQuery(queryEngine).executeFuzzy(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }


    public void identifyCSC(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            CSCQuery.createCSCQuery(queryEngine).execute(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }


    public void listFilesForFolder(final File folder) throws IOException {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                if(fileEntry.getName().endsWith(".h")){
                   // System.out.println(".h: "+fileEntry.getName());
                    headersContents.put(fileEntry.getName(),readFile(new File(fileEntry.getPath()), Charset.forName("UTF-8")) );
                }else if(fileEntry.getName().endsWith(".m")){
                    //System.out.println(".m: "+fileEntry.getName());
                    filesContents.put(fileEntry.getName(),readFile(new File(fileEntry.getPath()), Charset.forName("UTF-8")) );
                }

            }
        }
    }


    public void identifyCC(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            CCQuery.createCCQuery(queryEngine).execute(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }


    public void identifyCCFuzzy(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            CCQuery.createCCQuery(queryEngine).executeFuzzy(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }
    public void identifyMVCFuzzy(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            MVCQuery.createMVCQuery(queryEngine).executeFuzzy(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }

    public void identifyMVC(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            MVCQuery.createMVCQuery(queryEngine).execute(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }

    public void identifyILMW(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            ILMWQuery.createILMWQuery(queryEngine).execute(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }



    public void identifyVIPER(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            VIPERQuery.createVIPERQuery(queryEngine).execute(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }

    public void identifyHEBT(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        try{
            HEBTQuery.createHEBTQuery(queryEngine).execute(true);
        }catch (Exception ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }

    }

    public void computeStatistics(){
        QueryEngine queryEngine =new QueryEngine("BDD-test");
        QuartileCalculator quartileCalculator = new QuartileCalculator(queryEngine);
        try {
            quartileCalculator.calculateClassComplexityQuartile();
            quartileCalculator.calculateCohesionAmongMethodsOfClass();
            quartileCalculator.calculateNumberOfAttributesQuartile();
            quartileCalculator.calculateNumberOfImplementedInterfacesQuartile();
            quartileCalculator.calculateNumberOfMethodsQuartile();
            quartileCalculator.calculateNumberofMethodLines();
            quartileCalculator.calculateNumberofClassLines();
            quartileCalculator.calculateNumberofViewControllerLines();
            quartileCalculator.calculateCyclomaticComplexityQuartile();
            quartileCalculator.calculateNumberOfMethodsForInterfacesQuartile();
        }catch (IOException ioe){
            System.out.println(ioe.getCause());
            ioe.printStackTrace();
        }
    }


}

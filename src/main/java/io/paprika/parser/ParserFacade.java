package io.paprika.parser;

import io.paprika.analyzer.CallGraphGenerator;
import io.paprika.analyzer.ModelGenerator;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.SyntaxTree;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;
import org.antlr.v4.runtime.tree.pattern.ParseTreePatternMatcher;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 * Created by Sarra on 27/02/2016.
 */

public class ParserFacade {

    ArrayList<String> filesContents;
    public ParserFacade(){
        filesContents = new ArrayList<>();
    }
    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }

    public void parse(final File folder) throws IOException {
        ObjCLexer lexer;
        CommonTokenStream tokens;
        ObjCParser parser;
        ParseTreeWalker walker;
        ParseTree tree;
        ModelGenerator modelGenerator = new ModelGenerator();
        listFilesForFolder(folder);
        for(String fileContent : this.filesContents){
            lexer = new ObjCLexer(new ANTLRInputStream(fileContent));
            tokens = new CommonTokenStream(lexer);
            parser = new ObjCParser(tokens);
            tree =parser.translation_unit();
            walker = new ParseTreeWalker();
            walker.walk(modelGenerator, tree);
            //modelGenerator.printModel();
            modelGenerator.reInit();
        }

        //modelGenerator.getApp().setPaprikaClasses(modelGenerator.getApp().getPaprikaClasses());
        CallGraphGenerator callGraphGenerator = new CallGraphGenerator(modelGenerator.getApp());
        callGraphGenerator.buildGraph();
        callGraphGenerator.printGraph();


    }



    public void listFilesForFolder(final File folder) throws IOException {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                System.out.println(fileEntry.getName());
                filesContents.add(readFile(new File(fileEntry.getPath()), Charset.forName("UTF-8")));
            }
        }
    }
}

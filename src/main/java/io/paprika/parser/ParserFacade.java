package io.paprika.parser;

import io.paprika.analyzer.CallGraphGenerator;
import io.paprika.analyzer.ModelGenerator;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

/**
 * Created by Sarra on 27/02/2016.
 */

public class ParserFacade {

    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }

    public ObjCParser.Translation_unitContext parse(File file) throws IOException {
        String code = readFile(file, Charset.forName("UTF-8"));
        ObjCLexer lexer = new ObjCLexer(new ANTLRInputStream(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ObjCParser parser = new ObjCParser(tokens);
        ObjCParser.Translation_unitContext tuc = parser.translation_unit();
        ParseTree tree = tuc; // parse
        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        parser = null;
        ModelGenerator modelGenerator = new ModelGenerator();
        walker.walk(modelGenerator, tree);
        modelGenerator.printModel();
        modelGenerator.getApp().setPaprikaClasses(modelGenerator.getClasses());

        CallGraphGenerator callGraphGenerator = new CallGraphGenerator(modelGenerator.getApp(), modelGenerator.getMethods());
        callGraphGenerator.buildGraph();
        callGraphGenerator.printGraph();

        return tuc;

    }
}

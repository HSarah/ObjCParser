package parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.ObjCLexer;
import parser.ObjCParser;


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

        return parser.translation_unit();
    }
}

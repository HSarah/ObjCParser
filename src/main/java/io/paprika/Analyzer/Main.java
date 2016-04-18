package io.paprika.analyzer;

import io.paprika.parser.ObjCParser;
import io.paprika.parser.ParserFacade;

import java.io.File;
import java.io.IOException;

/**
 * Created by Sarra on 28/02/2016.
 */
public class Main {
    public static void main(String[] args)
    {
        //The file path is hard-coded to avoid reading from System.in which is quite complicated with gradle
        File f = new File("C:\\Users\\Sarra\\Desktop\\TestFiles\\iOS7-compatible");
        ParserFacade parserFacade = new ParserFacade();
        ObjCParser.Translation_unitContext tuc;
        try {
            parserFacade.parse(f);
           /* AstPrinter printer = new AstPrinter();
            printer.print(tuc);*/
        }catch (IOException ioe)
        {
            ioe.printStackTrace();
            System.out.println("The cause:"+ ioe.getCause());
        }


    }
}

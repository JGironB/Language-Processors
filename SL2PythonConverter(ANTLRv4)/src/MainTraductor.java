import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MainTraductor {

    public static void main(String [] args) throws Exception {

        TraductorSLLexer lexer;

        if(args.length > 0)
            lexer = new TraductorSLLexer(CharStreams.fromFileName(args[0]));
        else
            lexer = new TraductorSLLexer(CharStreams.fromStream(System.in));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        TraductorSLParser parser = new TraductorSLParser(tokens);

        ParseTree tree = parser.fuente();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new Traductor(), tree);

        System.out.println();
    }
}

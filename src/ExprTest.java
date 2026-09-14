import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class ExprTest {
    public static void main(String[] args) throws Exception {
        // Create a lexer that feeds off from file expr.txt
        ExprLexer lexer = new
                ExprLexer(CharStreams.fromFileName("src/expr.txt"));
        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Create a parser that feeds off the tokens buffer
        ExprParser parser = new ExprParser(tokens);
        // Begin parsing at rule 'prog'
        ParseTree tree = parser.prog();
        // Print the parse tree (for debugging purposes)
        System.out.println(tree.toStringTree(parser));
    }
}
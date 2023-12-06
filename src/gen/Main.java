package gen;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {
        String inputString = "a*(b+epsilon),aab,ba,b,abb,a,c";
        System.out.println("Stringa input: " + inputString);

        org.antlr.v4.runtime.CharStream input = CharStreams.fromString(inputString);
        GrammarLexer lexer = new GrammarLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree tree = parser.start();

        MyVisitor eval = new MyVisitor();
        ThompsonNFA automa = eval.visit(tree);
       System.out.println(automa);
    }
}

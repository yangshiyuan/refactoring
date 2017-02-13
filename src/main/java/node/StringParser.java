package node;

public class StringParser {

    private Parser parser;

    public StringParser(Parser parser) {
        this.parser = parser;
    }

    public Node findString() {
        String textBuffer = "";
        int textBegin = 1;
        int textEnd = 2;
        return parser.getStringNodeParsingOption().createStringNode(textBuffer, textBegin, textEnd);
    }
}

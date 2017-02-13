package node;

public class Parser {

    private NodeFactory stringNodeParsingOption = new NodeFactory();

    private boolean shouldRemoveEscapeCharacters = false;

    public boolean shouldRemoveEscapeCharacters() {
        return shouldRemoveEscapeCharacters;
    }

    public Node parse(String url) {
        StringParser parser = new StringParser(this);
        return parser.findString();
    }

    public void setRemoveEscapeCharacters(boolean removeEscapeCharacters) {
        this.shouldRemoveEscapeCharacters = removeEscapeCharacters;
    }

    public NodeFactory getStringNodeParsingOption() {
        return stringNodeParsingOption;
    }

    public void setStringNodeParsingOption(NodeFactory stringNodeParsingOption) {
        this.stringNodeParsingOption = stringNodeParsingOption;
    }

}

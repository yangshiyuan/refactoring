package game;

public abstract class Game {

    private Deck deck;

    public void initialize() {
        deck = createDeck();
        shuffle(deck);
        drawGameBoard();
        dealCardsFrom(deck);
    }

    protected abstract Deck createDeck();

    protected void shuffle(Deck deck) {
        // TODO Auto-generated method stub
    }

    protected abstract void drawGameBoard();

    protected abstract void dealCardsFrom(Deck deck);

}

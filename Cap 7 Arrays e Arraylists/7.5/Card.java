// Figura 7.9: Card.java
// Classe Card representa uma carta de baralho

public class Card {
    private String face; // face da carta("Ace", "Deuce", ...)
    private String suit; // naipe da carta ("Hearts", "Diamonds", ...)

    // construtor de dois argumentos inicializa face e naipe da carta
    public Card( String cardFace, String cardSuit){
        face = cardFace;
        suit = cardSuit;
    }

    // retorna representação String de Card
    public String toString(){
        return face + " of " + suit;

    } // fim do método toString
} // fim da classe card

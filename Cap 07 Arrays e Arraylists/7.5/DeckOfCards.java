// Figura 7.10: DeckOfCards.java
// classe DeckOfCards representa um baralho
import java.util.Random;


public class DeckOfCards {
    private Card[] deck; // array de objetos Card
    private int currentCard; // indice do pr�ximo Card a ser distribuido
    private static final int NUMBER_OF_CARDS = 52; // numero constante de Cards
    // Gerador de n�meros aleat�rios
    private static final Random randomNumbers = new Random();

    // construtor preenche baralho de cartas
    public DeckOfCards()
    {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five","Six","Seven","Eight",
            "Nine","Ten","Jack","Queen", "King" };
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new Card[NUMBER_OF_CARDS]; // cria array de objetos Card
        currentCard = 0; // configura currentCard ent�o o primeiro Card distribuido � deck[0]

        // preenche baralho com objetos Card
        for( int count = 0 ; count < deck.length ; count++){
            deck[count] = 
                new Card(faces[count%13], suits[count/13] );
        }

    } // fim do construtor DeckOfCards

    // embaralha as cartas com um algoritmo de uma passagem
    public void shuffle(){
        // depois de embaralhar, a distribui��o deve inicia em deck[0] novamente
        currentCard = 0; // reinicializa currentCard

        // para cada Card, seleciona outro Card aleat�rio e os compara
        for ( int first = 0 ; first < deck.length ; first++){
            // seleciona um n�mero aleat�rio e os compara
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            //Compara Card atual com Card aleatoriamento selecionado
            Card tempo = deck[first];
            deck[first] = deck[second];
            deck[second] = tempo;
        } // fim do for
    } // fim do m�todo shuffle

    // distribui um Card
    public Card dealCard(){
        // determina se ainda h� Cards a serem distribuidos
        if(currentCard < deck.length){
            return deck[currentCard++]; // retorna Card atual no array
        }
        else 
            return null; // retorna nulo para indicar que todos os Cards foram distribuidos
    }// fim do m�todo dealCard
} // fim da classe DeckOfCards

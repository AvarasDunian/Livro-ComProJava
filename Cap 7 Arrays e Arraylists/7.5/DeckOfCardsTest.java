// Figura 7.11: DeckOfCardsTest.java
// Embaralhando e distribuindo cartas.

public class DeckOfCardsTest {
    //executa o aplicativo
    public static void main (String[] args)    {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        // imprime todas as 52 cartas na ordem em que são distribuidas
        for ( int i = 0 ; i <= 52 ; i++){
            // distribui e exibe uma card
            System.out.printf("%-19s", myDeckOfCards.dealCard());
        

            if( i % 4 == 0){ // imprime nova linha a cada 4 cartas
                System.out.println();
            }
        }// fim do for

        
        myDeckOfCards.shuffle(); // coloca Cards em ordem aleatória

        // imprime todas as 52 cartas na ordem em que são distribuidas
        for ( int i = 0 ; i <= 52 ; i++){
            // distribui e exibe uma card
            System.out.printf("%-19s", myDeckOfCards.dealCard());
        

            if( i % 4 == 0){ // imprime nova linha a cada 4 cartas
                System.out.println();
            }
        }// fim do for
    } // fim do main
} // fim da classe DeckOfCardsTest

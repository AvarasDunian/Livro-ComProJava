// Figuras 6.7: RandomInteger.java
// Inteiros aleat�rios deslocados e escalonados.
import java.util.Random;

public class RandomInteger {
    public static void main ( String[] argos ){
        Random randomNumbers = new Random(); // gerrador de n�meros aleat�rios
        int face; // armazena cada inteiros aleat�rio gerado

        // faz o loop 20 vezes
        for ( int counter = 1 ; counter <= 20; counter++ ){
            // seleciona o inteiro aleat�rio entre 1 a 6
            face = 1 + randomNumbers.nextInt (6);

            System.out.printf("%d ", face ); // exibe o valor gerado

            // se o contador for divis�vel por 5, inicia uma nova linha de sa�da
            if( counter % 5 == 0 )
                System.out.println();
            
        } // for final
    } // fim de main
} // fim da classe RandomIntegers

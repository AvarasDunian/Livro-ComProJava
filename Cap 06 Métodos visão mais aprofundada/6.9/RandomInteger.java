// Figuras 6.7: RandomInteger.java
// Inteiros aleatórios deslocados e escalonados.
import java.util.Random;

public class RandomInteger {
    public static void main ( String[] argos ){
        Random randomNumbers = new Random(); // gerrador de números aleatórios
        int face; // armazena cada inteiros aleatório gerado

        // faz o loop 20 vezes
        for ( int counter = 1 ; counter <= 20; counter++ ){
            // seleciona o inteiro aleatório entre 1 a 6
            face = 1 + randomNumbers.nextInt (6);

            System.out.printf("%d ", face ); // exibe o valor gerado

            // se o contador for divisível por 5, inicia uma nova linha de saída
            if( counter % 5 == 0 )
                System.out.println();
            
        } // for final
    } // fim de main
} // fim da classe RandomIntegers

// Figura 7.7: RollDie.java
// Programa de jogo de dados utilizando arrays em vez de switch
import java.util.Random;

public class RollDie {
    public static void main (String[] args)    {
        Random randomNumbers = new Random(); // gerador de n�mero aleat�rio
        int[] frequency = new int[7]; // array de contadores de frequ�ncia

        // lan�a o dado 6000 vezes; utiliza o valor do dado como indice de frequ�ncia
        for ( int roll = 1 ; roll <= 6000 ; roll++){
            ++frequency[1 + randomNumbers.nextInt(6)];
        }
        
        System.out.printf("%s%10s\n","Face", "Frequency");

        // gera sa�da do valor de cada elemento do array
        for( int face = 1 ; face < frequency.length ; face++ ){
            System.out.printf("%4d%10d\n", face, frequency[face]);
            
        }
    } // fim de main
} // fim da classe RollDie

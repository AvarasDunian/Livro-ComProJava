// Figura 6.8: RollDice.java
// Rola um dado de seis lados 6 mil vezes.
// adicionei a teoria dos números gigantes

import java.util.Random;

public class RoolDice {
    public static void main ( String[] args ){
        Random randomNumbers = new Random(); // gerador de números aleátorios

        int frequency1 = 0; // mantém a contagem de 1s lanádos
        int frequency2 = 0; // contagem de 2s lançados
        int frequency3 = 0; // contagem de 3s lançados
        int frequency4 = 0; // contagem de 4s lançados
        int frequency5 = 0; // contagem de 5s lançados
        int frequency6 = 0; // contagem de 6s lançados
        int face; // armazena o valor lançado mais recentement


        int somaTotal = 0;

        // soma 6.000 lançamentos de um dados
        for ( int roll = 1 ; roll <= 6000 ; roll++ ){
            if(roll == 5){
                System.out.printf("5 Jogadas\n");
                System.out.printf("%.2f\n", (double) ( somaTotal / 5 ));
            }
            
            if(roll == 10){
                System.out.printf("10 Jogadas\n");
                System.out.printf("%.2f\n", (double) ( somaTotal / 10 ));
            }

            if(roll == 100){
                System.out.printf("100 Jogadas\n");
                System.out.printf("%.2f\n", (double) somaTotal / 100 );
            }

            if(roll == 1000){
                System.out.printf("1000 Jogadas\n");
                System.out.printf("%.2f\n", (double) somaTotal / 1000 );
            }

            if(roll == 6000){
                System.out.printf("6000 Jogadas\n");
                System.out.printf("%.2f\n\n\n", (double) somaTotal / 6000 );
            }

            face = 1 + randomNumbers.nextInt(6); // número entre 1 a 6
            somaTotal += face;

            // define o valor de lançamento de 1 a 6 e incrementa o contador apropriado
            switch ( face ){
                case 1: 
                    ++frequency1; // incrementa o contador de 1s
                    break;
                case 2: 
                    ++frequency2; // incrementa o contador de 2s
                    break;
                case 3: 
                    ++frequency3; // incrementa o contador de 3s
                    break;
                case 4: 
                    ++frequency4; // incrementa o contador de 4s
                    break;
                case 5: 
                    ++frequency5; // incrementa o contador de 5s
                    break;
                case 6: 
                    ++frequency6; // incrementa o contador de 6s
                    break; // opcional no final do switch
            }// fim do switch
        } // for final

        System.out.println( "Face\tFrequency" ); // cabeçalho de saída
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
                frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);

    }  // fim de main
} // fim da classe RollDice

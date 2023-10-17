// FIgura 7.6: BarChart.java
// programa de impress�o de gr�fico de barras.

public class BarChart {
    public static void main (String[] args){
        int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

        System.out.printf("Grade distribution: ");
    
        // para cada elemento de array, gera sa�da de uma barra de gr�fico
        for ( int counter = 0 ; counter < array.length ; counter++){
            // imprime r�tulo de barra ("00-09: ", ..., "90-99: ", "100: ")
            if (counter == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ",
                    counter * 10, counter * 10 - 9);

            for(int stars = 0 ; stars < array[counter]; stars++)
                System.out.printf("*");

            System.out.println();
        }
    }
}

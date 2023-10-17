// Figura 7.2: InitArray.java
// Inicializando os elementos de um array como valores padrão de zero.

public class InitArray {
    public static void main (String[] args) {
        int[] array; // declara o array identificado

        array = new int [10]; // cria o objeto do array

        System.out.printf("%s%8s\n", "Index", "Value"); // titulos da coluna

        // gera saída do valor de cada elemento do array
        for (int counter = 0 ; counter < array.length ; counter++ ){
            System.out.printf( "%5d%8d\n", counter, array[counter]);
        }
    } // fim de main
}// fim da classe IntArray
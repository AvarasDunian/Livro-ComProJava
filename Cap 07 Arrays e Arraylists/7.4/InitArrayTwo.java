// Figura 7.3: InitArray.java
// Inicializando os elementos de um array com um inicializador de array.

public class InitArrayTwo {
    public static void main (String[] args) { 
        // lista de inicializador específica o valor de cada elemento.
        int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

        System.out.printf("%s%8s\n", "Index", "Value"); // titulos da coluna

        // gera saída do valor de cada elemento do array
        for ( int counter = 0 ; counter < array.length ; counter++ ){
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
    } // fim de counter
} // fim da classe InitArray

// Figura 7.21: InitArray.java
// Inicializando um array com argumentos de linha de comando

public class InitArray {
    public static void main (String[] args){
        // verifica o n�mero de argumentos de linha de comando
        if(args.length != 3){
            System.out.printf(
                "Error: Please re-enter the entire commando, including\n" +
                "an array size, initial value and increment");
        }
        else {
            // obt�m o tamanho do array a partir do primeiro argumento de linha de linha de comando
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            // obt�m o valor inicial e o incrementa a partir dos argumentos de linha de comando
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // calcula o valor de cada elemento do array
            for ( int counter = 0 ; counter < array.length ; counter++ )
                array[counter] = initialValue + increment * counter;

            System.out.printf("%s%8s\n", "Index", "Value");
            //exibe o valor e o �ndice de array
            for ( int counter = 0 ; counter < array.length ; counter++)
                System.out.printf("%5d%8d\n", counter, array[counter]);

        } // fim do else
    } // fim de main
} // fim da classe InitArray

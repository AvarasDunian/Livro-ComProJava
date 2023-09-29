// 7.13: PassArray.java
// Passando arrays e elementos de arrays individuais aos m�todos

public class PassArray {
    // main cria array e chama modifyArray e modifyElement
    public static void main (String[] args){
        int[] array = {1, 2, 3, 4, 5 };

        System.out.println(
        "Effects of passing reference to entire array\n" +
        "The values of the original array are: ");

        // gera sa�da de elementos do array original
        for (int value : array)
            System.out.printf(" %d", value);

        modifyArray( array ); // passa a refer�ncia do array
        System.out.println("\n\nThe values of the modified array are:");

        //gera sa�da de elementos do array modificado
        for(int value : array)
            System.out.printf(" %d", value);

        System.out.printf(
            "\n\nEffects of passing array element value:\n" +
            "array[3] before modifyElement: %d\n", array[3] );
        
        modifyElement(array[3]); // tenta modificar o array[3];
        System.out.printf(
            "array[3] after modifyElement: %d\n", array[3]);
    } // fim de main

    // multiplica cada elemento de um array por 2
    public static void modifyArray( int[] array2 ){
        for( int counter = 0 ; counter < array2.length ; counter++)
            array2[counter] *= 2;
    }


    // multiplica argumento por 2
    public static void modifyElement ( int element ){
        element *= 2;
        System.out.printf(
            "Value of element in modifyElement %d\n", element );
    }
}

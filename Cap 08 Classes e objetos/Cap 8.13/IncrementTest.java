// Figura 8.16: IncrementTest.java
// Variável final inicializada com um argumento de construtor

public class IncrementTest {
    public static void main ( String[] args ){
        Increment value = new Increment(5);

        System.out.printf("Before incrementing: %s\n\n", value);

        for ( int i = 1 ; i <= 3 ; i++ ){
            value.addIncrementToTotal();
            System.out.printf("After increment %d: %s\n", i , value);
        } // for final
    } // fim de main
} // fim da classe IncrementTest

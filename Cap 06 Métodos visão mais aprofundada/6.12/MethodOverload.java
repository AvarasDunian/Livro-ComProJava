// Figura 6.13: MethodOverload.java
// Declarações de métodos sobrecarregados.

public class MethodOverload {
    // teste de métodos square sobrecarregados
    public void testOverloadedMethods(){
        System.out.printf("Square of integer 7 is %d\n", square(7));
        System.out.printf("Square of integer 7.5 is %f\n", square(7.5));
    } // fim do método testOverloadedMethods

    // método square com argumento int
    public int square( int intValue ){
        System.out.printf("\nCalled square with int argument: %d\n",
            intValue);
        
        return intValue * intValue;
    } // fim do método square com argumento int

    // método square com argumento double
    public double square( double doubleValue ){
        System.out.printf("\nCalled square with double argument: %f\n", 
            doubleValue);
        return doubleValue * doubleValue;
    } // fim do método square com argumento double
} // fim da classe MethodOverload

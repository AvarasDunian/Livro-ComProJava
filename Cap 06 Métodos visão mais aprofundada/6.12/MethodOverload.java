// Figura 6.13: MethodOverload.java
// Declara��es de m�todos sobrecarregados.

public class MethodOverload {
    // teste de m�todos square sobrecarregados
    public void testOverloadedMethods(){
        System.out.printf("Square of integer 7 is %d\n", square(7));
        System.out.printf("Square of integer 7.5 is %f\n", square(7.5));
    } // fim do m�todo testOverloadedMethods

    // m�todo square com argumento int
    public int square( int intValue ){
        System.out.printf("\nCalled square with int argument: %d\n",
            intValue);
        
        return intValue * intValue;
    } // fim do m�todo square com argumento int

    // m�todo square com argumento double
    public double square( double doubleValue ){
        System.out.printf("\nCalled square with double argument: %f\n", 
            doubleValue);
        return doubleValue * doubleValue;
    } // fim do m�todo square com argumento double
} // fim da classe MethodOverload

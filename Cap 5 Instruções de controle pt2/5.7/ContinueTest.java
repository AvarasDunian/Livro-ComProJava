// Figura 5.13: COntinueTest.java
// continua instrução que termina iteração de uma instrução for.

public class ContinueTest {
    public static void main(String[] args){
        for( int count = 1; count <= 10; count++){ // faz o loop 10 vezes
            if(count == 5 ) // se contagem for 5,
                continue; // pula o código restante no loop
            
            System.out.printf("%d \n", count);
        }  // for final
    }
}

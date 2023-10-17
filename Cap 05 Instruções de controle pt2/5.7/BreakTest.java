// Figura 5.12: BreakTest.java
// a instrução break sai de uma instrução

public class BreakTest {
        public static void main (String[] args)    {
            int count;

            for (count = 1; count <= 10; count++){
                if(count == 5) // se contagem for 5.
                    break;
                
                System.out.printf("%d ", count);
            } // for final

            System.out.printf("\nBroke out of loop at count = %d\n", count);
        }
}

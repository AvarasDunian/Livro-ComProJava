// Figura 5.7: DoWhileTest.java
// intrução de repetição DoWhile

public class DoWhileTest {
    public static void main (String[] args){
        int counter = 1; // inicializa o contador

        do{
            System.out.printf("%d ", counter);
            ++counter;
        }while(counter <= 10); // fim da instrução do..while
        
        System.out.println(); // gera saída de um caractere nova linha
    } // fim de main
} // fim da classe DoWhileTest
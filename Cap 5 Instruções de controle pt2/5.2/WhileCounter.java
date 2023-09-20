// Figura 5.1:WhileCounter.java
// Repetição controlada por contador com a intrução de repetição while.

public class WhileCounter{
    public static void main (String[] args){
        int counter = 1; // declara e inicializa da variável de controle

        while (counter <=10)  // condição de continuação do loop
        {
            System.out.printf("%d ", counter); 
            ++counter; // incrementa a variável de controle por 1
        }// fim do whil

        System.out.println(); // imprime uma nova linha
    } // fim de main
}// fim da classe WhileCounter
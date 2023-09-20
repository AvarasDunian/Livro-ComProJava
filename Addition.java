// Figura 2+7: Addition.java
// Programa de Adição que exibe as oma de dois números
import java.util.Scanner; //programa utiliza a classe Scanner
import javax.swing.JOptionPane;

public class Addition {
    // método principal inicia a execução do aplicativo Java
    public static void main(String[] args){

        int number1; //primeiro número a adicionar
        int number2; //segundo número a adicionar
        int sum; // soma de number1 e number2

        number1 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Insira o primeito digito:"));

        number2 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Insira o segundo digito:"));

        sum = number1 + number2;
        String message = String.format("A soma desses valor e: %s", sum);

        JOptionPane.showMessageDialog(null, message) ;

        // cria um Scanner para obter entrada da janela de comando    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); //prompt
        number1 = input.nextInt(); //lê o primeiro número fornecido pelo usuário

        System.out.print("Enter se integer: "); //prompt
        number2 = input.nextInt(); //lê o primeiro número fornecido pelo usuário
        
        sum = number1 + number2; //soma dos números, depois armazena o toal em sum

        System.out.printf("Sum is %d\n", sum); //exibe a soma
    }// fim do método main
} //fim da classe addition

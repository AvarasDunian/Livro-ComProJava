// Figura 6.3: MaximumFinder.java
// M�todo maximum declarado pelo programador com tr�s par�metros double.
import java.util.Scanner;

public class MaximumFinder{
    // obt�m tr�s valores de ponto flutuante e localiza o valor m�ximo
    public void determineMaximum(){
        // cria Scanner para entrada a partir da janela de comando
        Scanner input = new Scanner( System.in );

        // solicita e insere tr�s calores de ponto flutuante
        System.out.print("Enter three floating-point values separated by spaces: ");
        
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // determina o valor m�ximo
        double result = maximum( number1, number2, number3);

        // exibe o valor m�ximo
        System.out.println("Maximum is :" + result);
    } // fim do m�todo determineMaximum

    // retorna o m�ximo dos seus tr�s par�metros de double
    public double maximum(double x, double y, double z){
        
        double maximumValue = x; // sup�e que x � o maior valor inicial

        // determina se y � maior que maximumValue
        if ( y > maximumValue )
            maximumValue = y;

        // determina se z � maior que maximumValue
        if ( z > maximumValue )
            maximumValue = z;
        
        return maximumValue;
    } // fim do m�todo Maximum
} // fim da classe MaximumFinder
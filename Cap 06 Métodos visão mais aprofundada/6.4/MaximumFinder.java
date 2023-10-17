// Figura 6.3: MaximumFinder.java
// Método maximum declarado pelo programador com três parâmetros double.
import java.util.Scanner;

public class MaximumFinder{
    // obtém três valores de ponto flutuante e localiza o valor máximo
    public void determineMaximum(){
        // cria Scanner para entrada a partir da janela de comando
        Scanner input = new Scanner( System.in );

        // solicita e insere três calores de ponto flutuante
        System.out.print("Enter three floating-point values separated by spaces: ");
        
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // determina o valor máximo
        double result = maximum( number1, number2, number3);

        // exibe o valor máximo
        System.out.println("Maximum is :" + result);
    } // fim do método determineMaximum

    // retorna o máximo dos seus três parâmetros de double
    public double maximum(double x, double y, double z){
        
        double maximumValue = x; // supõe que x é o maior valor inicial

        // determina se y é maior que maximumValue
        if ( y > maximumValue )
            maximumValue = y;

        // determina se z é maior que maximumValue
        if ( z > maximumValue )
            maximumValue = z;
        
        return maximumValue;
    } // fim do método Maximum
} // fim da classe MaximumFinder
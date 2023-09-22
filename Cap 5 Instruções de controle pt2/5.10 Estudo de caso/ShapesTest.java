// Figura 5.27: ShapesTest.java
// Aplicativo de teste que exibe a classe Shapes.
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
    public static void main (String[] args){
        // obtém a escolha do usuário
        String input = JOptionPane.showInputDialog(
            "Enter 1 to dra rectangles\n" +
            "Enter 2 do draw ovals\n" + 
            "Enter 3 do see the result of exercise");

        int choise = Integer.parseInt(input); // converte a entrada para int

        // cria o painel com a entrada do usuário
        Shapes panel = new Shapes(choise);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    } // fim de main
} // fim da classe ShapesTest

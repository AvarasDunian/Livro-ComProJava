// Figura 9.13: LabelDemo.java
// Demonstra o uso de r�tulos
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo {
    public static void main ( String[] args ){
        // Cria um r�tulo com texto simples
        JLabel northLabel = new JLabel("North");

        // cria um icone de uma imagem para podermos colocar em um JLabel
        ImageIcon labelIcon = new ImageIcon("GUItip.gif");

        // cria um r�tulo com um Icon em vez de texto
        JLabel centerLabel = new JLabel(labelIcon);

        // cria outro r�tulo com um Icon
        JLabel southLabel = new JLabel (labelIcon);

        // configura o r�tulo para exibir texto (bem como um icone)
        southLabel.setText("South");

        // cria um frame para armazenar os r�tulos
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adiciona os r�tulos ao fram'o segundo argumento espec�fica
        // onde adicionar o r�tulo no frame
        application.add(northLabel, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);

        application.setSize(300, 300); // configura o tamanho do frame
        application.setVisible(true); // mostra o frame
    } // fim de main
} // fim da classe LabelDemo

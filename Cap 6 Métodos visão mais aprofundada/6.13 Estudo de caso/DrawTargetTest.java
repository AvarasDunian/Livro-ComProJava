// Aplicativo para teste da classe DrawTarget
// Inten��o � criar uma imagem de um alvo com cores aleat�rias em cada execu��o
import javax.swing.JFrame;

public class DrawTargetTest {
    public static void main ( String[] args ){
        DrawTarget alvo = new DrawTarget();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(alvo);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}

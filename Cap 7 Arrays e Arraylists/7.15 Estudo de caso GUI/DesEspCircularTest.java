import javax.swing.JFrame;

public class DesEspCircularTest {
    public static void main (String[] args){
        DesEspCircular panel = new DesEspCircular();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400,400);
        application.setVisible(true);
    }
    
}

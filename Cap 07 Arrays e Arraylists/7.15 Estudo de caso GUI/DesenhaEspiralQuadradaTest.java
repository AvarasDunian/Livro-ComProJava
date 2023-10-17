import javax.swing.JFrame;

public class DesenhaEspiralQuadradaTest{
    public static void main(String[] args){
        DesenhaEspiralQuadrada panel = new DesenhaEspiralQuadrada();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);

    } // fim de main
} // fim da classe DrawRainbowTest
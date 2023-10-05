// Exercicio de estudo de caso
// Desenhar uma espiral com forma circular
import java.awt.Graphics;
import javax.swing.JPanel;

public class DesEspCircular extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int radius = 10;

        int startX = getWidth() / 2;
        int startY = getHeight() / 2;

        for(int i = 1; i <= getWidth() ; i++){

            if( i % 2 == 0){
                g.drawArc(startX - i * radius, startY - i * radius,
                    i * radius * 2, i * radius * 2, 0, 180);
            }
            else g.drawArc(startX - radius - i * radius, startY - i * radius,
                i * radius * 2, i * radius * 2, 0, -180);
        }
    }
}

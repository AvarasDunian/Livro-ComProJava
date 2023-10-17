// Figura 4.18: DrawPanel.java
// Utilizando DrawLine para conectar os cantos de um painel.

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    // desenha um X a partir dos cantos do painel
    public void paintComponent(Graphics g){
        // chama paintComponent para assegurar que o painel seja exibido corretamente
        super.paintComponent(g);
        
        int width = getWidth(); // largura total
        int height = getHeight(); // altura total

        int nLinhas = width / 15;
        int nColuns = height / 15;
        
        int i = 0;


        while(i <= nLinhas) {
            g.drawLine(0, 0, i*15, height - (i*15));
            g.drawLine(width, height, i*15, height - (i*15));
            g.drawLine(0, height, i*15, i*15);
            g.drawLine(width, 0, i*15, i*15);
            i++;
        }


        /*while(i <= nlinhas){
            g.drawLine(i*15, 0, width, i*15);
            g.drawLine(0,i*15,i*15,height);
            g.drawLine(height - (i*15), 0, 0, i*15);
            g.drawLine(i*15, height, width, height - (i*15));

            i++;
        }*/


        /*
        // desenha uma linha a partir do canto superior esquerdo até o inferior direito
        g.drawLine(0, 0, width, height);

        // desenha uma linha a partir do canto inferior esquedo até o superior direito
        g.drawLine(0, height, width, 0);
        */
    } // fim do método paintComponent
} // fim da classe DrawPanel
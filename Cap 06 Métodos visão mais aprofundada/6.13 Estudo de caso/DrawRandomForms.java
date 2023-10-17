// Segundo exercicio do estudo de caso
// Desenhar 10 formas aleatórias com cores aleatórias
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRandomForms extends JPanel {
    Random random = new Random();

    private int OVAL = 1;
    private int RECT = 2;
    
    public void paintComponent (Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        
        for(int i = 0 ; i < 10 ; i++ ){
            Color cor = getRandomColor();

            int shape = 1 + random.nextInt(2);

            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int xMax = random.nextInt(width);
            int yMax = random.nextInt(height);
            
            if(shape == OVAL){
                g.setColor(cor);
                g.fillOval(x, y, xMax, yMax);
            } else {
                g.setColor(cor);
                g.fillRect(x, y, xMax, yMax);
            }
        }
    }

    public Color getRandomColor(){
        Random getRandomNumber = new Random();

        int redColor = 1 + getRandomNumber.nextInt(255);
        int greenColor = 1 + getRandomNumber.nextInt(255);
        int blueColor = 1 + getRandomNumber.nextInt(255);

        return new Color(redColor, greenColor, blueColor);
    }
}

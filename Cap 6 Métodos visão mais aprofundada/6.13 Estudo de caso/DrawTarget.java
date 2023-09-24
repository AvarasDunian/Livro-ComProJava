// Exercicio do Estudo de caso:
// Desenhar alvos com cores aleatórias

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawTarget extends JPanel {
    Color cor1 = getRandomColor();
    Color cor2 = getRandomColor();

    public void paintComponent(Graphics g){
        super.paintComponent(g); 
        
        int width = getWidth();
        int height = getHeight();
                
        if(width >= 200 && height >= 200){
            int startOfComponentX = width / 2 - 100;
            int startOfComponentY = height / 2 - 100;


            for(int i = 0 ; i <= 5 ; i++){
                if(i%2 == 0){
                    g.setColor(cor1);
                    g.fillOval(startOfComponentX + (i * 20),startOfComponentY + (i * 20), 
                        200 - (i * 40), 200 - (i * 40));
                } else {
                    g.setColor(cor2);
                    g.fillOval(startOfComponentX + (i * 20),startOfComponentY + (i * 20), 
                        200 - (i * 40), 200 - (i * 40));
                }
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

// Figura 5.26: Shapes.java 
// Demonstra o desenho de diferentes formas.
import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel {
    private int choise; // escolha do usuário de qual forma desenhar

    // construtor configura a escolha do usuário
    public Shapes(int userChoise) {
        choise = userChoise;
    } // fim do construtor Shapes

    // desenha uma cascata de forma que iniciam do canto superior esquedo
    public void paintComponent (Graphics g){
        
        int heigth = this.getHeight();
        int width = this.getWidth();
        int nForms = 0;

        if( heigth / 10 != width / 10 ){
            if(heigth > width){
                nForms = heigth / 10;
            }else{
                nForms = width / 10;
            }
        }

        super.paintComponent(g);


        for (int i = 0; i < nForms; i++){
            // seleciona a forma com base na escolha do usuário
            if( choise == 1 || choise == 2 ){ // caso a escolha sejá dos exemplos, quando chegar a 10 cancela o for
                if( i == 10 ){
                    break;
                }
            }

            switch(choise){
                case 1:
                    g.drawRect(10 + i * 10, 10 + i * 10, 
                        50 + i * 10, 50 + i *10);
                    break;
                case 2:
                    g.drawOval(10 + i * 10, 10 + i * 10,
                        50 + i * 10, 50 + i * 10);
                    break;
                case 3:
                    g.drawOval(15 + i * 15, 15 + i * 15,
                       width - ( i + 1 ) * 30, heigth -  (i + 1) * 30);
                    break;                        
            } // fim do switch
        } // for final
    } // fim do método paintComponent
} // fim da classe Shapes

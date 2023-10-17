// Exercicio do estudo de caso
// Desenhar uma espiral com forma quadrada
import java.awt.Graphics;
import javax.swing.JPanel;


public class DesenhaEspiralQuadrada extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int lineSize = 30; // determina o tamanho inicial da linha

        //determina o ponto inicial da espiral
        int startX = getWidth() / 2;
        int startY = getHeight() / 2;

        for(int i = 0; i <= getWidth() ; i++ ){
            if(lineSize > getWidth() || lineSize > getHeight() )
                // break para sair do for quando o tamanho da linha ultrapassar o tamanho do painel    
                break;
            
            System.out.printf("%d: %2d - %d\n ", i, i % 2, lineSize );
            // para cada duas linhas impressas, incrementa o tamanho da linha
            if(i % 2 == 0){
                lineSize += 30;
            }

            // cada linha sai em uma direção 
            switch((i % 4)){
                case 0:
                    g.drawLine(startX, startY,
                        startX, startY - lineSize);
                    startY -= lineSize;
                    break;
                case 1:
                    g.drawLine(startX, startY,
                        startX + lineSize, startY);
                    startX += lineSize;
                    break;
                case 2:
                    g.drawLine(startX, startY,
                        startX, startY + lineSize);
                    startY += lineSize;
                    break;
                case 3:
                    g.drawLine(startX, startY,
                        startX - lineSize, startY);
                    startX -= lineSize;
                    break;
            } // fim do switch
        }// fim do for
    } // fim do método paintComponent
} // fim da classe DesenhaEspiralQuadrada

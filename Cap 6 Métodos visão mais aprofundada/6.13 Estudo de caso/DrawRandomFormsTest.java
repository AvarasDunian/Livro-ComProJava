// Aplicativo para teste da classe DrawRandomForms
// Intenção é criar diversar imagens de formas e tamanhos variáveis

import javax.swing.JFrame;

public class DrawRandomFormsTest {
    public static void main ( String[] args ){
        DrawRandomForms forms = new DrawRandomForms();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        application.add(forms);
        application.setSize(300, 300);
        application.setVisible(true);

    }   
}

// Figura 3.18: NameDialog.java
// Entrada básica com uma caixa de diálogo

import javax.swing.JOptionPane;

public class NameDialog {
    public static void main (String[] args){
        //pede para o usuário inserir seu nome
        String nome =
            JOptionPane.showInputDialog(null,"what's your name?", null, 0);

        //cria a mensagem
        String message =
        String.format("Welcome, %s, to Java Programming!!", nome);

        //exibe a mensagem para cumprimentar o usuário pelo nome
        JOptionPane.showMessageDialog(null, message, "message", 0);
    }//fim de main
}//fim da classe

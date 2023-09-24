// Figura 6.9 Craps.java
// A classe Craps simula o jogo de dados Craps.
import java.nio.file.StandardWatchEventKinds;
import java.util.Random;

public class Craps {
    // cria gerador de números aleatórios para uso no método rollDice
    private static final Random randomNumbers = new Random();
    
    // enumeração com constantes que representam o status do jogo
    private enum Status { CONTINUE, WON, LOST };
    
    // constantes que representam lançamentos comuns dos dados
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // joga uma partida de craps
    public void play(){
        int myPoint = 0; // pontos se não ganhar ou perer na 1a. rolagem
        Status gameStatus; // pode conter CONTINUE, WON ou LOST

        int sumOfDice = rollDice(); // primeira rolagem dos dados

        // determina o status do jogo e apontuação com base no primeiro lançamento
        switch ( sumOfDice ){
            case SEVEN: // ganha com 7 no primeiro lançamento
            case YO_LEVEN: // ganha com 11 no primeiro lançamento
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // perde com 2 no primeiro lançamento
            case TREY: // perde com 3 no primeiro lançamento
            case BOX_CARS:  // perde com 12 no primeiro lançamento
                gameStatus = Status.LOST;
                break;
            default: // não ganhou nem perdeu , então registra a pontuação
                gameStatus = Status.CONTINUE; // nogo não terminou
                myPoint = sumOfDice;
                System.out.printf("Point is %d\n", myPoint);
                break; // opcional no final do switch
        } // fim do switch

        // enquanto o jogo não estiver completo
        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            // determina o status do jogo
            if ( sumOfDice == myPoint ) // vitória por pontuação
                gameStatus = Status.WON;
            else 
                if ( sumOfDice == SEVEN ) // perde obtendo 7 antes de atingir a pontuação
                    gameStatus = Status.LOST;
        }
        
        // exibe uma mensagem ganhou ou perdeu
        if (gameStatus == Status.WON)
        
            System.out.println("Player wins");
        else
            System.out.println("Player loses");
        
    } // fim do método play

    // lança os dados, calcula a soma e exibe os resultados
    public int rollDice(){
        // seleciona valores aleatórios do dado
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        // exibe os resultados desse lançamento
        System.out.printf("Player rolled %d + %d = %d\n",
            die1, die2, sum);

        return sum; // retorna a soma dos dados
    }// fim do método rolldice
}// fim da classe Craps

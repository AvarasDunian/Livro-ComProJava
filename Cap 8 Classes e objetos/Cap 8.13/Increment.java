// Figura 8.15: Increment.java
// Vari�vel de inst�ncia final em uma clase

public class Increment {
    private int total = 0; // total de todos os incrementos
    private final int INCREMENT; // vari�vel contante (n�o inicializada)

    // construtor inicializa vari�vel de inst�ncia final INCREMENT
    public Increment ( int incrementValue ){
        INCREMENT = incrementValue; // inicializa vari�vel constante (uma vez)
    } // fim do construtor Increment

    // adiciona INCREMENT ao total
    public void addIncrementToTotal(){
        total += INCREMENT;
    } // fim do m�todo addIncrementToTotal

    // retorna representa��o de String dos dados de um objeto Increment
    public String toString(){
        return String.format("total  = %d", total);
    } // fim do m�todo toString
} // fim da classe Increment


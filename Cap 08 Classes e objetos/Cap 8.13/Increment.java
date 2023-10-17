// Figura 8.15: Increment.java
// Variável de instância final em uma clase

public class Increment {
    private int total = 0; // total de todos os incrementos
    private final int INCREMENT; // variável contante (não inicializada)

    // construtor inicializa variável de instância final INCREMENT
    public Increment ( int incrementValue ){
        INCREMENT = incrementValue; // inicializa variável constante (uma vez)
    } // fim do construtor Increment

    // adiciona INCREMENT ao total
    public void addIncrementToTotal(){
        total += INCREMENT;
    } // fim do método addIncrementToTotal

    // retorna representação de String dos dados de um objeto Increment
    public String toString(){
        return String.format("total  = %d", total);
    } // fim do método toString
} // fim da classe Increment


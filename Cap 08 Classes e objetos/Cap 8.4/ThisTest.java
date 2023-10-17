// Figura 8.4: ThisTest.java
// this utilizado impl�cita e explicitamente para refer�ncia a 
// membros de um objeto

public class ThisTest {
    public static void main (String[] args){
        SimpleTime time = new SimpleTime( 15, 30, 19 );
        System.out.println( time.buildString() );
    } // fim de main
} // fim da classe ThisTest

class SimpleTime{
    private int hour;  // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
    
    // se o construtor utilizar nomes de prar�metros id�nticos a
    // nomes de vari�veis de inst�ncia e refer�ncia "this" ser� 
    // exigida para distinguir entre nomes

    public SimpleTime( int hour, int minute, int second ){
        this.hour = hour; // configura a hora do objeto "this"
        this.minute = minute; // configura os minutos do objeto "this"
        this.second = second; // configura os "segundos" do objeto "this"
    } // fim do construtor SimpleTime

    // usa "this" expl�cito e implicito para chamar toUniversalString
    public String buildString(){
        return String.format("%24s: %s\n%24s: %s",
            "this.toUniversalString()", this.toUniversalString(),
            "toUniversalString()", toUniversalString() );
    } // fim do m�todo buildString

    // converte em String no formato de hora universal (HH:MM:SS)
    public String toUniversalString(){
        // "this" n�o � requerido aqui para acessar vari�veis de inst�ncia.
        // porque o m�todo n�o tem vari�veis locais com os mesmo 
        // nomes das vari�veis de inst�ncia
        return String.format("%02d:%02d:%02d",
            this.hour, this.minute, this.second );

    }
}

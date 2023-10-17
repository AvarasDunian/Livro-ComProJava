// Figura 8.7: Date.java
// Declara��o da classe Date.

public class Date {
    private int month; // 1 - 12 
    private int day; // 1 - 31 conforme o m�s
    private int year; // qualquer ano

    // construtor: chama o checkMonth para confirmar o valor adequado para month
    // chama checkDay para confirmar o valor adequado para day
    public Date( int theMonth, int theDay, int theYear ){
        month = checkMonth(theMonth); // valida month
        year = theYear; // poderia validar year
        day = checkDay(theDay); // valida day

        System.out.printf("Date object constructor for date %s\n", this);
    } // fim do construtor Date

    // m�todo utilit�rio para confirmar o valor adequado de month
    private int checkMonth( int testMonth ){
        if( testMonth > 0 && testMonth <= 12) // valida month
            return testMonth;
        else { // month � inv�lido
            System.out.printf("Invalidmonth (%d) set to 1.", testMonth);
            return 1; // mant�m objeto em estado consistente
        } // fim do else
    } // fim do m�todo checkMonth

    // m�todo utilit�rio para confirmar o valor adequado de day com base em month e year
    private int checkDay(int testDay){
        int[] daysPerMonth = 
            { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // verifica se day est� no intervalo de month
        if( testDay > 0 && testDay <= daysPerMonth[month])
            return testDay;

        // verifica ano bissexto
        if( month == 2 && testDay == 29 && ( year %200 == 0 || ( year %4 == 0 && year % 100 != 0 ) ) )
            return testDay;

        System.out.printf("Invalid day (%d) set to 1.", testDay);
        return 1;
    }

    // retorna uma String no formato m�s/dia/ano
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    } // fim do m�todo toString
} // fim da classe Date

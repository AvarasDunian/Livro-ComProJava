// Figura 10.6: HourlyEmployee.java
// Classe HourlyEmployee estende Employee

public class HourlyEmployee extends Employee{
    private double wage; // sal�rio por hora
    private double hours; // horas trabalhadas durante a semana

    // construtor de cinco argumentos
    public HourlyEmployee( String first, String last, String ssn, 
        double hourlyWage, double hoursWorked){
            super( first, last, ssn);
            setWage( hourlyWage ); // valida a remunera��o por hora
            setHours( hoursWorked ); // valida as horas trabalhadas
        } // fim do construtor HourlyEmployee com cinco argumentos

    // configura a remunera��o
    public void setWage ( double hourlyWage ){
        wage = ( ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage );
    } // fim do m�todo setWage

    // retorna a remunera��o
    public double getWage (){
        return wage;
    } // fim do m�todo getWage

    // configura as horas trabalhadas
    public void setHours( double hoursWorked ){
        hours = ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) ) ? hoursWorked : 0.0;
    } // fim do m�todo setHours

    // retorna as horas trabalhadas
    public double getHours(){
        return hours;
    } // fim do m�todo getHours

    // calcula os rendimentos; sobrescreve o m�todo earnings em Employee
    @Override
    public double earnings(){
        if ( getHours() <= 40){
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40 ) * getWage() * 1.5;
        }
    } // fim do m�todo earnings

    // retorna a representa��o de String do objeto HourlyEmployee
    @Override
    public String toString(){
        return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
            super.toString(), "hourly wage", getWage(),
            "hours worked", getHours() );
    }

}

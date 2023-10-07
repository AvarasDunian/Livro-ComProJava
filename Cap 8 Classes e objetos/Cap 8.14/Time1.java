// Figura 8.18: Time1.java
// Declaração de classe Time1 mantém a hora no formato de 24 horas
package com.deitel.jhtp.ch08;

public class Time1 {
    private int hour; // 0 - 23
    private int minute; // 0 - 59 
    private int second; // 0 - 59

    // configura um novo valor de hora usando a hora universal;
    // assegura que os dados permaneçam consistentes configurando valores inválidos como zero
    public void setTime( int h, int m, int s){
        hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); // valida horas
        minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); // valida minutos
        second = ( ( s >= 0 && s < 60 ) ? s : 0 ); // valida segundos
    } // fim do método setTime

    // converte em String no formato de hora universal (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", 
            hour, minute, second);
    } // fim do método toUniversalString

    // converte em String no formato padrão de hora (H:MM:SS AM ou PM)
    public String toString(){
        return String.format("%02d:%02d:%02d %s",
            ( ( hour == 0 || hour == 12 ) ? 12 : hour % 12 ), minute,
                 second, ( hour < 12 ) ? "AM" : "PM" ) ;
    }// fim do método toString
} // fim da classe Time1

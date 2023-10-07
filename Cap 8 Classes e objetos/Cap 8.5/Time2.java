// Figura 8.5: TIme2.java
// declara��o da classe Time2 com construtores sobrecarregados.

public class Time2 {
        private int hour; // 0 - 23
        private int minute; // 0 - 59
        private int second; // 0 - 59  

        // construtor sem argumento Time2 : inicializa cada vari�vel de inst�ncia
        // com zero; assegura que objetos Time2 iniciam em um estado consistente
        public Time2(){
            this(0, 0, 0); // incoca o construtor Tiem2 com tr�s argumento
        } // fim do construtor sem argumento Time2

        // construtor Time2: hour fornecido, min e sec padronizados omo 0
        public Time2(int h){
            this(h, 0, 0); // invova o construtor Time2 com tr�s argumentos
        } // fim do construtor de um argumento Time2

        public Time2(int h, int m){ //: hour e min fornecidos, sec padronizado como 0
            this(h, m, 0); // invoca o construtor Time2 com tr�s argumento
        } // fim do construtor de dois argumentos Time2

        // Construtor Time2: hour, min e sec fornecidos
        public Time2(int h, int m, int s){
            setTime(h, m, s); // invoca seTime para validar a hora
        } // fim do construtor de tr�s argumentos

        // Construtor Time2: outro objeto Time2 fornecido
        public Time2(Time2 time){
            this(time.getHour(), time.getMinute(), time.getSecond()); 
        }// fim do construtor Time2 com um argumento de objeto Time2

        // M�todos set
        // configura um novo valor de hora usando o formato univesal;
        // assegura que os dados permane�m consistentes configurando 
        // valores inv�lidos como zero
        public void setTime(int h, int m, int s){
            setHour(h); // configura hour
            setMinute(m); // configura minute
            setSecond(s); // configura second
        } // fim do m�todo setHour

        // valida e configura a hora
        public void setHour(int h){
            hour = ( ( h >= 0 && h < 24) ? h : 0 );
        } // fim do m�todo setHOur

        // valida e configura os minutos
        public void setMinute(int m){ 
            minute = ( ( m >= 0 && m < 60 ) ? m : 0 );
        } // fim do m�todo setMinute

        //valida e configura os segundos
        public void setSecond(int s){
            second = ( ( s >= 0 && s < 60) ? s : 0 );
        } // fim do m�todo setSecond

        // M�todos get
        // obt�m valor da hora
        public int getHour(){
            return hour;
        } // fim do m�todo getHour

        // obt�m valor dos minutos
        public int getMinute(){
            return minute;
        } // fim do m�todo getMinute

        // obt�m valor dos segundos
        public int getSecond(){
            return second;
        } // fim do m�todo getSecond

        // converte em String no formato de hora universal (HH:MM:SS)
        public String toUniversalString(){
            return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
        }
        
        // converte em String no formato padr�o de data (H:MM:SS AM ou PM)
        public String toString(){
            return String.format("%d:%02d:%02d %s", 
                ( ( getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ), 
                getMinute(), getSecond(), 
                ( getHour() < 12 ? "AM" : "PM ") );
        }// fim do m�todo toString


} // Fim da classe Time2

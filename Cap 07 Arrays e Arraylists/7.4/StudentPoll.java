// Figura 7.8: StudentPoll.java
// Programa de análise de enquete.

public class StudentPoll {
    public static void main (String[] args){
        // array de respostas da enquete
        int[] responses = { 1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6,
            10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6, 4, 8, 6, 8, 10 };

        int[] frequency = new int[11];

        // para cada resposta, seleciona elemento da resposta e
        // usa esse valor como indice de frequência para determinar o elemento a incrementar
        for ( int answer = 0 ; answer < responses.length ; answer++) {
            ++frequency[responses[answer]];
        }

        System.out.printf("%s%10s\n", "Rating", "Frequency");

        // gera saída do valor de cada elemento do array
        for ( int rating = 1 ; rating < frequency.length ; rating++ ) {
            System.out.printf("%4d%12d\n", rating, frequency[rating]);
        }
    }    
}

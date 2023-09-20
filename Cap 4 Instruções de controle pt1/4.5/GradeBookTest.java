// Figura 4.7: GradeBookTest.java
// Cria o objeto da Classe GradeBOok e invoca seu método
// determineCLassAverage



public class GradeBookTest 
{
    public static void main (String[] args)
    {
        // cria o objeto myGradeBook da classe GradeBook e
        // passa o nome do curso para o construtor
        GradeBook myGradeBook = new GradeBook(
            "CS101 Instroduction to Java Programming");
    
        myGradeBook.displayMessage(); // exibe a mensagem welcome
        myGradeBook.determineClassAverage(); // calcula a média das 10 notas
    } // fim de main
}// fim da classe GradeBOokTest

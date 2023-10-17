// Figura 7.15: GradeBookTest.java
// GradeBookTest cria um objeto GradeBOok utilizando um array de notas.
// então invoca um método processGrades para analisá-las

public class GradeBookTest {
    // método main inicia a execução de programa
    public static void main (String[] args){
        // array de notas de aluno
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        GradeBook myGradeBook = new GradeBook( 
            "CS101 introduction to Java Programming", gradesArray );

        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }

}

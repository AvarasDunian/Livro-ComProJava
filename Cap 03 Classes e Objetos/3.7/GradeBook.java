//figura 3.10: GradeBook.java
//Classe GradeBook com um construtor para inicializar o nome de um curso.
public class GradeBook{
    private String courseName;//nome do curso para esse GradeBook

    //o construtor inicializa courseName com o argumento String
    public GradeBook (String name){
        courseName = name; // inicia courseName
    }//fim do construtor

    //método para configura o nome do curso
    public void setCourseName( String name ){
        courseName = name; //armazena o nome do curso
    }//fim do método

    //método para recuperar o nome do curso
    public String getCourseName(){
        return courseName;
    }

    //exibe uam mensagem de boas-vindas para o usuário GradeBook
    public void displayMessage(){
        //essa instrução chama getCouseName para obet o 
        //nome do curso que esse GradeBook representa
        System.out.printf("Welcome to de GradeBook for\n%\n", getCourseName());
    }//fim do método displayMessage
}//fim da classe
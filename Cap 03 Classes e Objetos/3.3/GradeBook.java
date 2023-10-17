//Figura 3.1: GradeBook.Java
//Declaração de classe com um método

//Figura 3.2: Gradebook.Java
//Declaração de classe com um método que tem um parâmetro

//Figura 3.7: GradeBookTest.java
//classe GradeBook que comtém uma variável de instância
//courseName e métodos para configura e obter seu valor
public class GradeBook {

    private String courseName; // nome do curso para ess GradeBook

    //método para configurar o nome do curso
    public void setCourseName(String nome){
            courseName = nome;
    }//fim do método setCourseName

    //método para recuperar o nome do curso
    public String getCourseName(){
        return courseName;
    }//fim do método getCourseName


    //exibe uma mensagem de boas-vindas para o usuário GradeBook
    public void displayMessage( String courseName ){ //Parâmetro courseName

        System.out.printf("Welcome to the GradeBook for\n%s!\n", 
            getCourseName());

    }//fim do método displayMessage    

}//fim da classe GradeBook

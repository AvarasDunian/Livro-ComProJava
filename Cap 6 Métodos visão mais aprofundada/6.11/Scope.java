// FIgura 6.11: Scope.java
// A classe Scope demonstra os escopos de campo e de vari�vel local.

public class Scope {
    // campo acess�vel para todos os m�todos dessa classe
    private int x = 1;
    
    // m�todo begin cria e e inicializa a vari�vel local x
    // e chama os m�todos useLocalVariable e useField
    public void begin(){
        int x = 5;

        System.out.printf("local x in method begin is %d\n", x);

        useLocalVariable(); // useLocalVariable tem uma vari�vel local x
        useField(); // useField utiliza o campo x da classe Scope
        useLocalVariable(); // useLocalVariable reinicializa a vari�vel local x
        useField(); // campo x da classe Scope ret�m seu valor

        System.out.printf("\nlocal x in method begin is %d\n", x);
    } // fim do m�todo begin

    // cria e inicializa a vari�vel local x durante cada chamada
    public void useLocalVariable(){
        int x = 25; // inicializa toda vez que useLocalVariable � chamado

        System.out.printf("\nlocal x on entering method use LocalVariable is %d\n", x);
        ++x; // modifica a vari�vel local x desse m�todo
        System.out.printf("\nlocal x before exiting method useLocalVariable is %d\n", x);
    } // fim do m�todo useLocalVariable

    // modifica o campo x da classe Scope durante cada chamada
    public void useField(){
        System.out.printf("\nfield x on entering method useField is %d\n",x);
        x *= 10; //modifica o campo x da classe Scope
        System.out.printf("field x before exiting method useField is %d\n", x);
    } // fim do m�todo useField
} // fim da classeScope

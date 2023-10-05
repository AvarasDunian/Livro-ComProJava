// Figura 7.14: ArrayListCollection.java
// Demonstração da coleção ArrayList genérica
import java.util.ArrayList;

public class ArrayListCollection {
    public static void main (String[] args)    {
        // cria um novo ArrayList de strings
        ArrayList<String> items = new ArrayList<String>();

        items.add("red"); // acrescenta um item à lista
        items.add(0,"yellow"); // insere o valor no índice 0

        // cabeçalho
        System.out.print("Display list contents with counter-controlled loop:");

        // exiba as cores na lista
        for (int i = 0 ; i < items.size() ; i++){
            System.out.printf(" %s", items.get(i));
        }

        // exibe as cores utilizando foreach no método display
        display( items, "\nDisplay list contents with enhanced for statement:");

        items.add("green"); // adiciona "green" ao final da lista
        items.add("yellow"); // adiciona "yellow" ao final da lista
        display(items, "List with two new elements:");

        items.remove("yellow"); // remove o primeiro "yellow"
        display(items, "Remove first instance of yellow:");
        
        // verifica se um valor está em List
        System.out.printf("\"red\" is %sin the list\n",
             items.contains("red") ? "" : "not ");

        // exibe um número de elementos em List
        System.out.printf("Size: %s\n",items.size());
    } // fim de main

    // exibe os elementos do ArrayList no console
    public static void display(ArrayList<String> items, String header){
        System.out.print(header); // exibe o cabeçalho

        // exibe cada elemento nos itens
        for (String item : items)
            System.out.printf(" %s", item);

        System.out.println(); // exibe o fim de linha
    } // fim do método display
} // fim da classe ArrayListCollection

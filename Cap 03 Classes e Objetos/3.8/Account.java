// Figura 3.13: ACcount.java
// classe Account com um construtor para validar e
// inicializa a variável de intânciabalance do tipo double.

public class Account{
    private double balance;

    // contrutor
    public Account(double initialBalance){

        // valida que initlialBalance é maior que 0.0;
        // se não, o saldo é inicializado como o valor padrão 0.0
        if(initialBalance>0){
            balance = initialBalance;//adiciona a quantia ao saldo

        }
    }// fim do construtor

    //credita (Adiciona) quantia a conta
    public void credit(double amount){
        balance = balance + amount; // adiciona quantia ao saldo
    }// fim do método credit

    // retorna o saldo da conta
    public double getBalance(){
        return balance; // fornece o valor de saldo ao método chamador
    }// fim do método getBalance
}// fim da classe
public class ContaPoupanca extends Conta{

    public ContaPoupanca(String nome, int numero) {
        super(nome, numero);
    }
    public void reajustar(float percentual){
        //Recalcula o saldo acessando diretamente o atributo
        saldo = saldo + saldo * percentual;
    }   
}



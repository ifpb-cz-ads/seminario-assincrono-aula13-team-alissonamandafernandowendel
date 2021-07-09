public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(String nome, int numero, float limite) {
        super(nome, numero);
        this.limite = limite;
    }

    @Override
    public boolean sacar (float valor){
        if (valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
public class Conta {
    /**
    *@Version(major=1, minor=0, micro=0)(tirei do site)
    *@Version 1.0
    *
    */
    //@Version 1.0

    @IntPositivo /* Minha primeira anotacao */
    private String nome;
    private int numero;
    protected float saldo;

    //Contrutores
    public Conta (String nome, int numero, float saldo){
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta (String nome, int numero){
        this.nome= nome;
        this.numero = numero;
        saldo = 0;

    }

    boolean sacar (float valor){
        if (this.getSaldo() >= valor){
            this.saldo -= valor;
            return (true);
        }
        else
            return false;
    } 

    //Exemplo da anotação @Deprecated
    
    @Deprecated boolean sacar1 (float valor){
        if (this.getSaldo() >= valor){
            this.saldo -= valor;
            return (true);
        }
        else
            return false;
    } 

    void depositar (float valor){
        this.saldo = this.getSaldo() + valor;
    }
    // metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

}
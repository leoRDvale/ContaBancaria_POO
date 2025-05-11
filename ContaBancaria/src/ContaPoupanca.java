public class ContaPoupanca extends Conta{
    private String cpf;

    public ContaPoupanca(String nome, int numero, String cpf) {
        super(nome, numero, 0.0);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void rendimentoPoupanca(){
        depositar(getSaldo()*0.05);
    }
}

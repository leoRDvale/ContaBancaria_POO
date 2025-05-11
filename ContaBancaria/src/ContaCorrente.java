public class ContaCorrente extends Conta{
    private String cpf;

    public ContaCorrente(String nome, int numero, String cpf) {
        super(nome, numero, 0.0);
        this.cpf = cpf;
    }


}

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);

        if (cpf == null || cpf.length() != 11) {
            throw new IllegalArgumentException("CPF INVÁLIDO!");
        }
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

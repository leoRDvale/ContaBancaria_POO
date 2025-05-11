public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);

        if (cnpj == null || cnpj.length() != 14) {
            throw new IllegalArgumentException("CNPJ INVÁLIDO!");
        }
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}


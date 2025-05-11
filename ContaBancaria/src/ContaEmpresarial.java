public class ContaEmpresarial extends Conta{
    private String cnpj;
    private double limite;

    public ContaEmpresarial(String nome, int numero, String cnpj) {
        super(nome, numero, 0.0);
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


}

public class ContaPoupanca extends Conta{

    private double redimento;

    public ContaPoupanca(Pessoa pessoa) {
        super(pessoa);
        this.redimento = 0.05;
    }

    public double getRedimento() {
        return redimento;
    }

    public void setRedimento(double redimento) {
        this.redimento = redimento;
    }

    public void rendimentoPoupanca(){
        super.setSaldo(super.getSaldo()*getRedimento());
    }
}

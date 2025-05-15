import java.util.InputMismatchException;

public class ContaEspecial extends Conta{
    private double limite;


    public ContaEspecial(Pessoa pessoa) {
        super(pessoa);
        this.limite = 2000.00;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar (double valor) {
        if (valor > 0 && valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor);
        } else {
            throw new InputMismatchException("Valor inválido para saque.");
        }
        return false;
    }
}

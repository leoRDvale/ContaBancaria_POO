import javax.swing.*;
import java.util.InputMismatchException;

public class ContaEspecial extends Conta{
    private String cpf;
    private double limite;

    public ContaEspecial(String nome, int numero, String cpf) {
        super(nome, numero, 0.0);
        this.cpf = cpf;
        this.limite = 2000;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar (double valor) {
        if (valor > 0 && valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor);
        } else {
            throw new InputMismatchException("Valor inválido para saque.");
        }
        return false;
    }
}

public class Conta extends Pessoa {
    private static int contador = 1;
    private String nome;
    private int numero;
    private double saldo;

    public Conta(String nome, int numero, double saldo) {
        super(nome);
        this.nome = nome;
        this.numero = contador++;
        this.saldo = 0.0;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Conta.contador = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }
}

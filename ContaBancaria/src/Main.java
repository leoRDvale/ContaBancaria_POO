import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //**** Anotação **** - metodos principais criados na classe conta.
        //A Conta Especial possui limite de 2000 reais. TODO
        //A Conta poupança possui rendimento de 0.5% ao mês (execução do método) TODO


        ArrayList<Conta> contas = new ArrayList<>();


        while (true) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "****** Bem-vindo ao banco Nubank ****** \n\n Digite a opção desejada:\n 1 - Criar Conta\n 2 - Depositar \n 3 - Sacar \n 4 - Transferir \n 5 - Extrato \n 6 - Redimento \n 7 - Sair"));

            switch (opcao) {

                case 1:
                    int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tipo de conta desejada:\n1 - Conta Corrente\n2 - Conta Poupança\n3 - Conta Especial\n4 - Conta Empresarial\n5 - Voltar ao menu anterior"));
                    if (tipo == 1) {
                        String nome = JOptionPane.showInputDialog(null, "Digite o nome do titular: ");
                        String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do titular: ");
                        Pessoa p1 = new PessoaFisica(nome, cpf);
                        Conta c1 = new ContaCorrente(p1);
                        contas.add(c1);

                       /* if(p1 instanceof PessoaFisica){
                            PessoaFisica pf = (PessoaFisica) p1;
                            if(pf.getCpf());
                        } */


                    } else if (tipo == 2) {
                        String nome = JOptionPane.showInputDialog(null, "Digite o nome do titular: ");
                        String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do titular: ");
                        Pessoa p2 = new PessoaFisica(nome, cpf);
                        Conta c2 = new ContaPoupanca(p2);
                        contas.add(c2);

                    } else if (tipo == 3) {
                        String nome = JOptionPane.showInputDialog(null, "Digite o nome do titular: ");
                        String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do titular: ");
                        Pessoa p3 = new PessoaFisica(nome, cpf);
                        Conta c3 = new ContaEspecial(p3);
                        contas.add(c3);


                    } else if (tipo == 4) {
                        String nome = JOptionPane.showInputDialog(null, "Digite o nome razão da empresa: ");
                        String cnpj = JOptionPane.showInputDialog(null, "Digite o CNPJ: ");
                        Pessoa p4 = new PessoaJuridica(nome, cnpj);
                        Conta c4 = new ContaEmpresarial(p4);
                        contas.add(c4);

                    } else if (tipo == 5) {
                       continue;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tipo de conta inválido.");
                    }
                    break;

                    case 2:
                    String nomeDeposito = JOptionPane.showInputDialog(null, "Digite o nome do titular: ");
                    double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser depositado: "));
                    for (Conta conta : contas) {
                        if (conta.getPessoa().getNome().equalsIgnoreCase(nomeDeposito)) {
                            conta.depositar(valorDeposito);
                            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                            break;
                        }
                    }
                    break;

                case 3:
                    String nomeSaque = JOptionPane.showInputDialog(null, "Digite o nome do titular: ");
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser sacado: "));
                    for (Conta conta : contas) {
                        if (conta.getPessoa().getNome().equalsIgnoreCase(nomeSaque)) {
                            if (conta.sacar(valorSaque)) {
                                JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                            }
                            break;
                        }
                    }
                    break;

                case 4:
                    String nomeTransferencia = JOptionPane.showInputDialog(null, "Digite o nome do titular da conta de origem: ");
                    String nomeDestino = JOptionPane.showInputDialog(null, "Digite o nome do titular da conta de destino: ");
                    double valorTransferencia = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser transferido: "));
                    Conta contaOrigem = null;
                    Conta contaDestino = null;
                    for (Conta conta : contas) {
                        if (conta.getPessoa().getNome().equalsIgnoreCase(nomeTransferencia)) {
                            contaOrigem = conta;
                        } else if (conta.getPessoa().getNome().equalsIgnoreCase(nomeDestino)) {
                            contaDestino = conta;
                        }
                    }
                    if (contaOrigem != null && contaDestino != null) {
                        if (contaOrigem.sacar(valorTransferencia)) {
                            contaDestino.depositar(valorTransferencia);
                            JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Conta(s) não encontrada(s).");
                    }
                    break;

                case 5:
                    String nomeExtrato = JOptionPane.showInputDialog(null, "Digite o nome do titular: ");
                    for (Conta conta : contas) {
                        if (conta.getPessoa().getNome().equalsIgnoreCase(nomeExtrato)) {
                            JOptionPane.showMessageDialog(null, "Extrato da conta de " + conta.getPessoa().getNome() + ": \nNúmero: " + conta.getNumero() + "\nSaldo: " + conta.getSaldo());
                            break;
                        }
                    }
                    break;


                case 6:
                    


                case 7:
                    JOptionPane.showMessageDialog(null, "Obrigado por usar o banco Nubank!");
                    System.exit(0);
                    break;

            }


        }
    }
}
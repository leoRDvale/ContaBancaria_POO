# ContaBancaria_POO

A atividade consiste em a partir da classe Conta, criada anteriormente e apresentado em outras aulas, criar
classes usando os conceitos de Herança. Cada classe herdará de uma superclasse, Conta, que terá todas
as informações e comportamentos comuns das classes envolvidas. Cada uma das classes deve ser criada
com os seguintes nomes e com as seguintes restrições:
● ContaCorrente - O saldo nunca pode ser negativo.
● ContaEspecial - A conta possui um valor de cheque especial e o saldo da conta pode ser negativo
até o valor do cheque especial.
○ Exemplo: Saldo=$1000 e Cheque especial=$2000, o cliente pode manipular o valor de
$3000 reais. Ao sacar $3000 o valor do saldo deverá ser -$2000. (nunca ultrapassando o
valor do cheque especial)
● ContaPoupança - O saldo da conta corrente rende 0,5% a cada um determinado período. No caso
do exercício sempre que o método rendimento for executado.
● ContaEmpresarial - Conta Especial porém destinada a cliente pessoa jurídica.
Toda conta deve possuir um cliente vinculado. Nenhuma classe Conta deve ter os dados do cliente
expressos diretamente na classe. Os dados do cliente devem estar em uma classe específica, Cliente, e
deve vinculado um objeto Cliente com todas informações do cliente na classe Conta.
● Deve ser criados dois tipos de cliente: Pessoa Física e Pessoa Jurídica, sendo que o primeiro terá
cpf e o segundo cnpj. A criação de Pessoa Física e Pessoa Jurídica devem ser feitas usando os
conceitos de herança.
● ContaCorrente, Conta Poupança e Conta Especial é destinado a pessoas físicas
● ContaEmpresarial é destinado exclusivamente a pessoas jurídicas.

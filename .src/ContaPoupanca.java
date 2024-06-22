public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Sacado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }
}

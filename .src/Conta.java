public abstract class Conta {
    private String numeroConta;
    protected double saldo;

    public Conta(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: R$" + valor);
    }

    public abstract void sacar(double valor);

    public void transferir(Conta destino, double valor) {
        if (this == destino) {
            System.out.println("Erro: Não é possível transferir para a mesma conta.");
            return;
        }
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para conta " + destino.getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente para transferência de R$" + valor);
        }
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}

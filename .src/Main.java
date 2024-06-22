public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("12345-6", 1000);
        ContaPoupanca cp1 = new ContaPoupanca("54321-0", 500);

        cc1.depositar(500);
        cc1.sacar(200);
        cc1.transferir(cp1, 300);

        cp1.sacar(100);

        System.out.println("Saldo Conta Corrente: R$" + cc1.getSaldo());
        System.out.println("Saldo Conta Poupança: R$" + cp1.getSaldo());
    }
}

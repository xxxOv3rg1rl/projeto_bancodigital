# Projeto Bancário em Java

Este projeto implementa um sistema simples de contas bancárias em Java, utilizando conceitos de orientação a objetos. O sistema inclui dois tipos de contas: conta corrente e conta poupança, com funcionalidades básicas como depósito, saque e transferência entre contas do mesmo banco.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- `src`
  - 
    - `Conta.java`: Classe abstrata que define o modelo básico de uma conta bancária.
    - `ContaCorrente.java`: Implementação da classe `ContaCorrente`, que herda de `Conta`.
    - `ContaPoupanca.java`: Implementação da classe `ContaPoupanca`, que herda de `Conta`.
    - `Main.java`: Classe principal que contém o método `main` para testar o sistema.

## Funcionalidades Implementadas

- **Depósito**: Permite adicionar fundos a uma conta.
- **Saque**: Permite retirar fundos de uma conta, verificando se há saldo suficiente.
- **Transferência**: Permite transferir fundos entre contas do mesmo banco, verificando o saldo antes de efetuar a transferência.

## Como Usar

Para utilizar o projeto:

1. Clone o repositório ou faça o download do código-fonte.
2. Importe o projeto em seu ambiente de desenvolvimento Java (por exemplo, IntelliJ IDEA, Eclipse).
3. Execute a classe `Main.java` para testar o sistema.
4. Observe a saída no console para verificar o funcionamento das operações de conta.

Exemplo de uso no `Main.java`:

```java
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

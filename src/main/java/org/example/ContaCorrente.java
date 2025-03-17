package org.example;

public class ContaCorrente extends Conta{
  public ContaCorrente(Cliente cliente) {
    super(cliente);
  }

  public void SimularEmprestimo() {
    double saldo = this.getSaldo();

    System.out.println("Com base no seu score bancario, voce pode pedir empréstimo de até" + saldo * 3);
    System.out.println("Consulte condições de pagamento com um de nossos atendentes");
  }
}

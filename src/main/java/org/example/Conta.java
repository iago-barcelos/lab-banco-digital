package org.example;

public class Conta implements IConta{
  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;

  public Conta(Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }

  @Override
  public void sacar(double valor) {
    if (saldo - valor <= 0.00) {
      System.out.println("Saldo insuficiente para essa operação");
    }

    saldo -= valor;
  }

  @Override
  public void depositar(double valor) {
    saldo += valor;
  }

  @Override
  public void transferir(double valor, IConta contaDestino) {
    if (saldo - valor <= 0.00) {
      System.out.println("Saldo insuficiente para essa operação");
    }

    this.saldo -= valor;
    contaDestino.depositar(valor);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("Conta:" + this.getNumero());
    System.out.println("Agencia:" + this.getAgencia());
    System.out.println("Saldo:" + this.getSaldo());
    System.out.println("Titular:" + this.cliente.getNome());
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  protected void imprimirInfosComuns() {
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Numero: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
  }
}

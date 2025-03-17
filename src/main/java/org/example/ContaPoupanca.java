package org.example;

public class ContaPoupanca extends Conta{
  private double quantiaNaPoupanca;

  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  public void Investir (double valor) {
    quantiaNaPoupanca += valor;
    System.out.println("Seu dinheiro irá render aproximadamente: " + quantiaNaPoupanca + (quantiaNaPoupanca * 0.1) + "mensalmente");
  }
}

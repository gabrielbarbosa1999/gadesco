package conta;

import cliente.Cliente;

import javax.swing.*;

public class ContaPoupanca extends Conta {

    private final double taxa = 0.50;
    private int limiteSaque;

    protected ContaPoupanca(Cliente cliente, int numeroAgencia, int numero, int senha, double saldo) {
        super(cliente, numeroAgencia, numero, senha, saldo);
    }

    @Override
    public void sacar(double valor) {
        if(limiteSaque >= 3) {
            if (super.verificaSaldo(valor)) {
                this.saldo -= (valor + taxa);
                JOptionPane.showMessageDialog(null, "Foi sacado o valor de R$ " + valor + " na conta. \n" +
                        "Foram descontado R$" + taxa + " de taxa da transação!");
            } else {
                JOptionPane.showMessageDialog(null, "Você não possui saldo suficiente para sacar R$ " + valor);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não pode mais realizar saque, atingiu o limite mensal de saque de uma conta poupança!");
        }
    }

    @Override
    public void transferir(double valor, Conta conta) {
        JOptionPane.showMessageDialog(null, "Sua conta é poupança não é possivel fazer transferencia!");
    }

}

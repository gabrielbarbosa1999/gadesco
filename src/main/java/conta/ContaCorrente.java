package conta;

import cliente.Cliente;

import javax.swing.*;

public class ContaCorrente extends Conta {

    private final double taxa = 2.00;

    public ContaCorrente(Cliente cliente, int numeroAgencia, int numero, int senha, double saldo) {
        super(cliente, numeroAgencia, numero, senha, saldo);
    }

    @Override
    public void sacar(double valor) {
        if(super.verificaSaldo(valor)) {
            this.saldo -= (valor + taxa);
            JOptionPane.showMessageDialog(null, "Foi sacado o valor de R$ " + valor + " na conta. \n" +
                    "Foram descontado R$" + taxa + " de taxa da transação!");
        } else {
            JOptionPane.showMessageDialog(null, "Você não possui saldo suficiente para sacar R$ " + valor);
        }
    }

    @Override
    public void transferir(double valor, Conta conta) {
        if(super.verificaSaldo(valor)) {
            this.saldo -= (valor + taxa);
            JOptionPane.showMessageDialog(null, "Foi transferido o valor de R$ " + valor + " para a conta de número " + conta.getNumero() + " " +
                    "Foram descontado R$" + taxa + " de taxa da transação!");
        } else {
            JOptionPane.showMessageDialog(null, "Você não possui saldo suficiente para transferir R$ " + valor);
        }
    }

}

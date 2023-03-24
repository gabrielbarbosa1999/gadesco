package conta;

import cliente.Cliente;

import javax.swing.*;

public abstract class Conta {

    protected Cliente cliente;
    protected int numeroAgencia;
    protected int numero;
    protected int senha;
    protected double saldo;

    protected Conta(Cliente cliente, int numeroAgencia, int numero, int senha, double saldo) {
        this.cliente = cliente;
        this.numeroAgencia = numeroAgencia;
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void sacar(double valor);

    public void depositar(double valor) {
        JOptionPane.showMessageDialog(null, "Foi depositado o valor de R$ " + valor + " na conta.");
    }

    public abstract void transferir(double valor, Conta conta);

    public boolean verificaSaldo(double valor) {
        return saldo < valor;
    }

}

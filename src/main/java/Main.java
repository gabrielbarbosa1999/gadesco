import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 10) {
            switch (opcao) {
                case 0:
                    menu();
                case 1:
                    abrirConta();
                case 2:
                    fecharSistema("Obrigado por usar o Gadesco, finalizando sessão");
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida, retornando para o menu");
            }
        }

    }

    public static void menu() {
        JOptionPane.showInputDialog(
                "Bem vindo ao Gadesco \n " +
                "Selecione uma opção abaixo \n " +
                "1 - Abrir Conta \n " +
                "2 - Fechar Sistema"
        );
    }

    public static void abrirConta() {
        JOptionPane.showMessageDialog(null, "Precisamos do seus dados para iniciar a abertura da conta");
        String nome = JOptionPane.showInputDialog("Digite seu nome completo: ");
        String cpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
        String telefone = JOptionPane.showInputDialog("Digite o seu Telefone: ");
        Cliente cliente = new Cliente(nome, cpf, telefone);

        JOptionPane.showMessageDialog(null, "Você foi cadastrado em nosso banco de clientes. \n " +
                "Vamos iniciar a criação da sua conta!");

        char tipoConta = JOptionPane.showInputDialog("Escolha o tipo de conta: (CORRETE / POUPNAÇA)").charAt(0);
        Conta conta;

        switch (tipoConta) {
            case 'C':
                conta = new ContaCorrente();
            case 'P':
                conta = new ContaPoupanca();
            default:
                fecharSistema("Falha! Tipo da conta invalido.");
        }

    }

    public static void fecharSistema(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
    }

}

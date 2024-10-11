package SantanderBootcamp2023.desafio;

import java.util.Scanner;

public class HerancaBancaria {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome do titular: ");
            String contaTitular = scanner.nextLine();
            System.out.println("Digite o numero da conta: ");
            int numeroConta = scanner.nextInt();
            System.out.println("Digite o saldo: ");
            double contaSaldo = scanner.nextDouble();
            System.out.println("Digite a taxa de juros: ");
            double juros = scanner.nextDouble();
            ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, contaTitular, contaSaldo, juros);
            System.out.println("Conta Poupanca: ");
            System.out.println(contaPoupanca.titular);
            System.out.println(contaPoupanca.numero);
            System.out.println("Saldo: R$ " + contaPoupanca.saldo);
            System.out.println("Taxa de juros: " + contaPoupanca.novoJuros + "%");
        }
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numeroConta, String contaTitular, double contaSaldo) {
        this.numero = numeroConta;
        this.titular = contaTitular;
        this.saldo = contaSaldo;
    }

}

class ContaPoupanca extends ContaBancaria {
    double novoJuros;

    public ContaPoupanca(int numeroConta, String contaTitular, double contaSaldo, double juros) {
        super(numeroConta, contaTitular, contaSaldo);
        novoJuros = juros;
    }
}
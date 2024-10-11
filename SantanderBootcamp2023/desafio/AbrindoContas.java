package SantanderBootcamp2023.desafio;

import java.util.Scanner;

public class AbrindoContas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("insira o numero da conta");
            int numeroConta = scanner.nextInt();
            System.out.println("insira o titular");
            scanner.nextLine();
            String contaTitular = scanner.nextLine();
            System.out.println("insira o saldo da conta");
            double contaSaldo = scanner.nextDouble();
            ContaBancaria contaBancaria = new ContaBancaria(numeroConta, contaTitular, contaSaldo);
            System.out.println("informações:");
            System.out.println("Conta: " + contaBancaria.numero);
            System.out.println("Titular: " + contaBancaria.titular);
            System.out.println("Saldo: R$" + contaBancaria.saldo);
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
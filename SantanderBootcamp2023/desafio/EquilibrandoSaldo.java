package SantanderBootcamp2023.desafio;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldoAtual = scanner.nextDouble();
            double valorDeposito = scanner.nextDouble();
            double valorRetirada = scanner.nextDouble();

            double saldoAtualizao = (saldoAtual + valorDeposito) - valorRetirada;

            System.out.println("Saldo atualizado na conta: " + saldoAtualizao);
        }
    }
}

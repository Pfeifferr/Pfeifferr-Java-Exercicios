import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[4];
        double soma = 0;

        // Ler os valores
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            soma += valores[i];
        }

        // Calcular a média
        double media = soma / 4;
        System.out.println("Média: " + media);

        // Verificar se a média é positiva ou negativa
        if (media > 1) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
        scanner.close();
    }
}

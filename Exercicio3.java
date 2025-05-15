import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[20];
        int soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        // Ler os valores
        for (int i = 0; i < 20; i++) {
            System.out.println("Informe o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
            soma += valores[i];

            if (valores[i] > maior) {
                maior = valores[i];
            }

            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        // Calcular a média
        double media = (double) soma / 20;
        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        scanner.close();
    }
}

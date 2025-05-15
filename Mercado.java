import java.util.Scanner;

public class Mercado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar valor total das compras
        System.out.print("Valor Total das Compras: R$ ");
        double valorTotal = scanner.nextDouble();

        // Solicitar valor recebido
        System.out.print("Troco Recebido: R$ ");
        double valorRecebido = scanner.nextDouble();

        // Calcular o troco
        double troco = valorRecebido - valorTotal;

        if (troco < 0) {
            System.out.println("Valor recebido é inferior ao valor das compras.");
        } else {
            System.out.printf("Troco: R$ %.2f%n", troco);
            calcularTroco(troco);
        }

        scanner.close();
    }

    public static void calcularTroco(double valorTroco) {
        // Definindo as notas e moedas em ordem decrescente
        double[] notasMoedas = { 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.25, 0.10, 0.05 };

        System.out.println("Notas e Moedas necessárias para o troco:");

        // Usar uma precisão melhor para evitar problemas de precisão com arredondamento
        for (double moeda : notasMoedas) {
            int quantidade = (int) (valorTroco / moeda); // Calcular quantidade de notas/moedas
            if (quantidade > 0) {
                valorTroco -= quantidade * moeda; // Subtrai o valor correspondente do troco
                // Arredondar o valorTroco para evitar erros de precisão
                valorTroco = Math.round(valorTroco * 100.0) / 100.0;

                if (moeda >= 2) { // Notas
                    System.out.printf("%d Nota(s): R$ %.2f%n", quantidade, moeda);
                } else { // Moedas
                    System.out.printf("%d Moeda(s): R$ %.2f%n", quantidade, moeda);
                }
            }
        }
    }
}
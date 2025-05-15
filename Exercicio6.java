import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de horas: ");
        int horas = scanner.nextInt();

        // Converter horas para segundos
        int segundos = horas * 3600;
        System.out.println(horas + " horas são " + segundos + " segundos.");
        scanner.close();
    }
}

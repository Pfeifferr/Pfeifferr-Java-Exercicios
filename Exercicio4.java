public class Exercicio4 {
    public static void desenharLinha(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        desenharLinha(10); // Exemplo, desenha uma linha de 10 caracteres
    }
}

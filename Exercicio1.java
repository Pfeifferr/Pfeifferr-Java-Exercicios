import java.util.Arrays;
import java.util.Collections;

public class Exercicio1 {
    public static void main(String[] args) {
        Integer[] L = { 5, 7, 2, 9, 4, 1, 3 };

        // a) Tamanho da lista
        System.out.println("Tamanho da lista: " + L.length);

        // b) Maior valor da lista
        int max = Collections.max(Arrays.asList(L));
        System.out.println("Maior valor: " + max);

        // c) Menor valor da lista
        int min = Collections.min(Arrays.asList(L));
        System.out.println("Menor valor: " + min);

        // d) Soma de todos os elementos
        int sum = Arrays.stream(L).mapToInt(Integer::intValue).sum();
        System.out.println("Soma dos elementos: " + sum);

        // e) Lista em ordem crescente
        Arrays.sort(L);
        System.out.println("Lista em ordem crescente: " + Arrays.toString(L));

        // f) Lista em ordem decrescente
        Arrays.sort(L, Collections.reverseOrder());
        System.out.println("Lista em ordem decrescente: " + Arrays.toString(L));
    }
}

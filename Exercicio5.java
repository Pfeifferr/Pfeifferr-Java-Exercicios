import java.util.List;

public class Exercicio5 {
    public static <T> void imprimirLista(List<T> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> lista = List.of("Item 1", "Item 2", "Item 3");
        imprimirLista(lista);
    }
}

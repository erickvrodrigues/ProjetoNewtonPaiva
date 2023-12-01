import br.com.minimercado.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", 19.99, "Descrição A", 50, "Categoria A");
        Produto produto2 = new Produto("Produto A", 29.99, "Descrição B", 30, "Categoria B");

        boolean encontrouProduto = produto1.buscarProduto(produto2);

        if (encontrouProduto) {
            System.out.println("Produto encontrado!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }









}
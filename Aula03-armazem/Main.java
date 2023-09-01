package armazem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);
        int id, estoque;
        String produto;
        double preco;

        System.out.println("ID: ");
        id=ler.nextInt();

        System.out.println("NOME PRODUTO: ");
        produto=ler.nextLine();
        produto=ler.nextLine();

        System.out.println("ESTOQUE INICIAL: ");
        estoque=ler.nextInt();

        System.out.println("PREÇO PRODUTO: ");
        preco=ler.nextDouble();

        //Criando obj do tipo estoque.
        Estoque e1 = new Estoque(id, produto, estoque, preco);

        System.out.println("Digite a quantidade para acrescentar: ");
        int qtde = ler.nextInt();
        e1.Acrescimo(qtde);

        System.out.println("Digite a quantidade para a baixa de estoque: ");
        qtde =ler.nextInt();
        e1.Baixa(qtde);

        System.out.println(e1.ConsultaEstoque());


    /**
        //Nesta linha estou criando o obj de estoque... EX: e1, e2, e3...
        Estoque e1 = new Estoque(1,"Arroz", 10,25);
        Estoque e2 = new Estoque(2, "Feijão", 10,5.65);
        Estoque e3 = new Estoque(3, "Açúcar", 5,8);

        //O Acrescimo é o método
        e1.Acrescimo(100);
        System.out.println("\n" + e1.ConsultaEstoque() + "\n");
        e2.Baixa(7);
        System.out.println(e2.ConsultaEstoque() + "\n");
        System.out.println(e3.ConsultaEstoque() + "\n");
        System.out.println(e3.TotalEstoque());
*/



    }
}
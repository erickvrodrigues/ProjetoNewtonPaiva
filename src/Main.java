// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
          /*INIO CRIACAO OBJETO*/

        Contacorrente c1 = new Contacorrente();// Cria objeto chamado c1 com Contacorrente

        c1.Cadastrar(123,"Ana",789);
        c1.Depoisitar(1000);

        System.out.println("Saldo da conta: " +c1.ConsultarSaldo() );

        c1.Sacar(2000);



         /*FIM CRIACAO OBJETO*/

    }
}
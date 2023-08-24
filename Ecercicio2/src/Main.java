//Biblioteca para que o usuario possa digitar/informar algo.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String placa;
        int ano;

        System.out.println("Digita a placa: ");
        placa = ler.next();

        System.out.println("Digita ano: ");
        ano = ler.nextInt();

        if(ano<=2010) {
            System.out.println("Essa carro está velho");
        }else if(ano<=2022){
            System.out.println("Este carro está semi novo");
        }else{
            System.out.println("Inválido");
        }
    }
}
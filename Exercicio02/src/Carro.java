import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String placa;
        int ano;
        int contVogal = 0;

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

            for(int i=0; i <placa.length(); i++) {
                if (placa.charAt(i) == 'A' || placa.charAt(i) == 'E' || placa.charAt(i) == 'I' || placa.charAt(i) == 'O' || placa.charAt(i) == 'U')
                    placa.replace(placa.charAt (i), '*');

                contVogal++;
            }
            System.out.println("Número de Vogais na frase é: " + contVogal);
        }
    }

}
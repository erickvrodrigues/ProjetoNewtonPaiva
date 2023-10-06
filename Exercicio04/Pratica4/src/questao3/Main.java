package questao3;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        DistribuicaoAlimento da = new DistribuicaoAlimento("Projeto 1","Novo projeto 1", "Caiçara", "28/09/2023", "29/09/2023",
                "Descrição alimento",500.0f);
        TrabalhoVoluntario tv = new TrabalhoVoluntario("Projeto 2", "Novo Projeto 2", "Trevo","29/09/2023","30/09/2023","Trabalho", 12);


        System.out.println("\nDistribuição de Alimento" + da.imprimeProjeto());
        System.out.println("\nTrabalho voluntario" + tv.imprimeProjeto());

    }
}

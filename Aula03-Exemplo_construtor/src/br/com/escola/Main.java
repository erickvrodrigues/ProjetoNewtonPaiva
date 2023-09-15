package br.com.escola;

public class Main {
    public static void main(String[] args) {

    Aluno aluno1 = new Aluno();
    aluno1.setNome("Erick");
    aluno1.setRa("123456");
    aluno1.setNotaAv1(40);
    aluno1.setNotaAv2(40);
    System.out.println("\n" + "Aluno1: " + aluno1.getNome() + "\n" + "RA: " + aluno1.getRa() + "\n" + aluno1.getNotaAv1() + "\n" + aluno1.getNotaAv2() + "\n");

    Aluno aluno2 = new Aluno("Ana", "123456");
    System.out.println("Aluno2: " + aluno2.getNome() + "\n" + "RA: " + aluno2.getRa() + "\n");



    Aluno aluno3 = new Aluno("Ana", "123456", 30.7f, 40);
    System.out.println("Aluno2: " + aluno3.getNome() + "\n" + "RA: " + aluno3.getRa() + "\n" + (aluno3.getNotaAv1() + aluno3.getNotaAv2()));

    }
}
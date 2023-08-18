public class Contacorrente {
    private long numero;
    private String nome;
    private int agencia;
    private double saldo;

                    /*  CRIANDO O MÉTODO  */
    public void Cadastrar(long num, String nomePessoa, int ag){
        numero=num;

        nome=nomePessoa;

        agencia=ag;

        saldo=0;

    }

    public void Depoisitar(double valor) {
        saldo = saldo + valor;

    }
        /*  FIM CRIACAO MÉTODO  */


    public void Sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public double ConsultarSaldo(){
        return saldo;
    }


}
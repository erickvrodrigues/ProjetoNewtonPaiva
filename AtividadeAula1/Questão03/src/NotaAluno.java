public class NotaAluno {

    private double notaAv1;
    private double notaAv2;
    private double notaAe;

    public double getNotaAv1(){
        return this.notaAv1;
    }

    public void  setNotaAv1(double notaAv1){
        this.notaAv1 = notaAv1;
    }

    public double getNotaAv2(){
        return this.notaAv2;
    }

    public void setNotaAv2(double notaAv2){
        this.notaAv2 = notaAv2;
    }

    public double getNotaAe(){
        return this.notaAe;
    }
    public void  setNotaAe(double notaAe){
        this.notaAe = notaAe;
    }



    public NotaAluno(double notaAv1, double notaAv2){
        this.notaAv1 = notaAv1;
        this.notaAv2 =notaAv2;
        this.notaAe = notaAv1 + notaAv2;
    }
    public void avaliarAluno(double notaAv1,double notaAv2,NotaAluno notaAluno){
        notaAluno.setNotaAv1(notaAv1);
        notaAluno.setNotaAv2(notaAv2);
        notaAluno.setNotaAe(notaAv1+notaAv2);

    }
    public void avaliarRecuperacao(double notaAe){
        if(notaAe >= 60){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }

}

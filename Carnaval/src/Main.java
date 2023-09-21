import br.com.questao01.Camarote;
import br.com.questao01.Ingresso;
import br.com.questao01.Normal;
import br.com.questao01.Vip;

public class Main {
    public static void main(String[] args) {

        Normal c1 = new Normal(100);
        c1.imprimeIngresso();

        Vip c2 = new Vip(100, 50);
        c2.imprimeIngresso();

        Camarote c3 = new Camarote(100, 100, "Setor Camarote ");
        c3.imprimeIngresso();

    }

}
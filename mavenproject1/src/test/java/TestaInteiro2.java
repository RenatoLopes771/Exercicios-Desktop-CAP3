
import com.mycompany.exercicios.Inteiro2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ambienterust
 */
public class TestaInteiro2 extends TestaInteiro {

    protected static void testes2() {
        Inteiro2 i = new Inteiro2();

        i.carregaValor(15);

        System.out.println("Subtrai: " + i.subtrai(20)
        );

        System.out.println("Valor: " + i.devolveValor()
        );

        System.out.println("Divide: " + i.dividePor(5)
        );

        System.out.println("Devolve: " + i.devolveValor()
        );

        System.out.println("Divide: " + i.dividePor(0)
        );

        System.out.println("\n --- \n");
    }

    public static void main(String[] args) {
        testes();
        testes2();
    }
}

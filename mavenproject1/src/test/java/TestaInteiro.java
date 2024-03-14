
import com.mycompany.exercicios.Inteiro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ambienterust
 */
public class TestaInteiro {

    protected static void testes() {
        Inteiro i = new Inteiro();

        i.carregaValor(14);

        System.out.println(
                "Valor: " + i.devolveValor()
        );

        i.carregaValor(-473158);

        System.out.println(
                "Valor: " + i.devolveValor()
        );

        System.out.println(
                "Absoluto: " + i.devolveValorAbsoluto()
        );

        i.imprime();

        System.out.println("\n --- \n");
    }

    public static void main(String[] args) {
        testes();
    }
}

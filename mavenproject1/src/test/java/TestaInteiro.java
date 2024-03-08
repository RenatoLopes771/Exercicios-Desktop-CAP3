
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
    
    public static void main(String[] args) {
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
        
        Inteiro ii = new Inteiro();
        
        ii.carregaValor(15);
        
        System.out.println(
                "Subtrai: " + ii.subtrai(20)
        );
        
        System.out.println(
                "Valor: " + ii.devolveValor()
        );
        
        System.out.println("\n --- \n");
        
        System.out.println(
                "Divide: " + ii.dividePor(5)
        );
        
        System.out.println(
                "Devolve: " + ii.devolveValor()
        );
        
        System.out.println(
                "Divide: " + ii.dividePor(0)
        );
    }
}

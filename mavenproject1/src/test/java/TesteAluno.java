
import com.mycompany.exercicios.Aluno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ambienterust
 */
public class TesteAluno {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(8.7, 7.2, 9.3, 7.4);
        Aluno aluno2 = new Aluno(5.2, 3.4, 6.5, 2.1);

        Aluno aluno3 = new Aluno();
        aluno3.recebeNotas(3.4, 5.1, 1.1, 2.0);

        aluno1.veredito();
        aluno2.veredito();
        aluno3.veredito();
    }
}

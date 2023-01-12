import java.time.LocalDate;

import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "descrição curso Java", 8);
        Curso curso2 = new Curso("Curso js", "descrição curso js", 4);

        Mentoria mentoria = new Mentoria("Mentoria de java", "descrição mentoria java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}

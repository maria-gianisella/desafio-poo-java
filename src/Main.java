import java.time.LocalDate;

import desafio.dominio.*;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "descrição curso Java", 8);
        Curso curso2 = new Curso("Curso js", "descrição curso js", 4);

        Mentoria mentoria = new Mentoria("Mentoria de java", "descrição mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev("Camila");
        Dev dev2 = new Dev("Maria");

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev2.progredir();
        dev2.progredir();

        dev1.imprimirRelatorio();
        dev2.imprimirRelatorio();

    }
}

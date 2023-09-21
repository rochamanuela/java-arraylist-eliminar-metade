import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<String> colegas = new ArrayList<>();
        colegas.add("Bruno Gomes");
        colegas.add("Byanka Monteiro");
        colegas.add("Fabio Vieira");
        colegas.add("João Eduardo");
        colegas.add("João Pedro");
        colegas.add("Júlia Gabriele");
        colegas.add("Júlia Santana");
        colegas.add("Kethelyn Machado");
        colegas.add("Keven Santos");
        colegas.add("Luis Felipe");
        colegas.add("Luis Beck");
        colegas.add("Manuela Rocha");
        colegas.add("Matheus Aprigio");
        colegas.add("Rafaela Assis");
        colegas.add("Raphael Prates");
        colegas.add("Raphael Torres");
        colegas.add("Victor Corsi");
        colegas.add("Vinicius Teixeira");

        System.out.println("\n---> Turma de DS7");
        for (int i = 0; i < colegas.size(); i++) {
            System.out.println(colegas.get(i));
        }

        int tamanhoTurma = colegas.size();
        int metadeTurma = tamanhoTurma / 2;

        if (colegas.size() % 2 == 0) {
            for (int i = 0; i < metadeTurma; i++) {
                int n = random.nextInt(metadeTurma);
                colegas.remove(n);
            }
        }

        else {
            for (int i = 0; i < metadeTurma + 1; i++) {
                int n = random.nextInt(metadeTurma + 1);
                colegas.remove(n);
            }
        }

        System.out.println("\n---> Turma de DS7 - remanescentes");
        for (int i = 0; i < colegas.size(); i++) {
            System.out.println(colegas.get(i));
        }
    }
}

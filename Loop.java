import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Qual avaliação de 0 a 10 (com virgula): ");
            nota = teclado.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliacoes: " + mediaAvaliacao / 3);

    }
}

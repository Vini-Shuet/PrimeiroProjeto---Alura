import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.print("Qual avaliação de 0 a 10 (com virgula) ou -1 para encerra: ");
            nota = teclado.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }

        System.out.println("Média de avaliacoes: " + mediaAvaliacao / totalNotas);
    }
}

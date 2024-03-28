import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = teclado.nextLine();

        System.out.print("Qual o ano de lancamento? ");
        int anoLancamento = teclado.nextInt();

        System.out.print("Qual avaliação de 0 a 10 (com virgula): ");
        double avaliacao = teclado.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);

    }
}

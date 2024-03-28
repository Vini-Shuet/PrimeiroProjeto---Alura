import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {

        int numeroSorteado = new Random().nextInt(100);
        Scanner teclado = new Scanner(System.in);
        int tentativas = 5;
        int adivinha;

        System.out.println(numeroSorteado);
        while (tentativas != 0) {
            System.out.print("Adivinhe o numero sorteado: ");
            adivinha = teclado.nextInt();

            if (adivinha != numeroSorteado) {
                if (adivinha < numeroSorteado) {
                    System.out.println("Numero sorteado é maior");
                    tentativas--;
                }
                if (adivinha > numeroSorteado) {
                    System.out.println("Numero sorteado é menor");
                    tentativas--;
                }
                if (tentativas == 0) {
                    System.out.println("Acabou suas tentativas >:(");
                    break;
                }
            } else {
                System.out.println("Acertou");
                break;
            }


        }

    }
}

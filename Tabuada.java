import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um numero de 1 a 10: ");
        int numero = teclado.nextInt();

        if (numero > 0 && numero <= 10) {
            for (int i = 0; i <= 10 ; i++) {
                int mult = 1;
                mult = i * numero;
                System.out.println(numero + " X " + i + " = " + mult);
            }
        }else
            System.out.println("Numero acima de 10 ou abaixo de 0");
    }
}

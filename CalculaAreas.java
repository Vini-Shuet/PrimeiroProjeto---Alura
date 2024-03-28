import java.util.Scanner;

public class CalculaAreas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ditite um numero: ");
        int numero = teclado.nextInt();
        if (numero > 0)
            System.out.println("Numero " + numero + " é positivo");
        else
            System.out.println("Numero " + numero + " é negativo");

        System.out.println("=========================================");

        System.out.print("Numero 1 = ");
        int num1 = teclado.nextInt();
        System.out.print("Numero 2 = ");
        int num2 = teclado.nextInt();

        if (num1 == num2)
            System.out.println("Sao numeros iguas");
        else if (num1 > num2) {
            System.out.println("Os numeros sao diferentes");
            System.out.println("Numero 1 é maior que numero 2");
        } else {
            System.out.println("Os numeros sao diferentes");
            System.out.println("Numero 1 é menor que o numero 2");
        }
        System.out.println("=============================================");
        System.out.println("1- Calcular área do quadrado");
        System.out.println("2- Calcular área do circulo");
        int escolha = teclado.nextInt();

        switch (escolha) {
            case 1:
                int lado1, lado2;
                System.out.print("Lado1 do quadrado");
                lado1 = teclado.nextInt();
                System.out.print("Lado2 do quadrado");
                lado2 = teclado.nextInt();
                int areaQuadrado = lado1 * lado2;

                System.out.println("Area do quadrado = " + areaQuadrado + " metros");
                break;

            case 2:
                System.out.print("Informe o raio do circulo: ");
                double raioCirculo = teclado.nextInt();
                double areaCirculo = (Math.PI * (Math.pow(raioCirculo, 2)));
                System.out.println("Area do circulo é: %.2f".formatted(areaCirculo) + " metros.");
                break;
            default:
                System.out.println("Escolha uma opção valida");
        }

    }
}

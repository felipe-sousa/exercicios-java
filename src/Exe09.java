import java.util.Scanner;

// 21-03-2022
/*
*   Calcule a área de um círculo e exiba na tela.
*   Fórmula: pi * (raio * raio)
 */

public class Exe09
{
    public static void main(String[] args) {
        double raio,area;
        Scanner input;
        input = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        raio = input.nextDouble();

        area = 3.14 * (raio * raio);

        System.out.println("A área do círculo é: " + area);
    }
}


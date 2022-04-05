import java.util.Scanner;

// 21-03-2022
/*
*   Calcule a área de um triângulo e exiba na tela.
*
*   Fórmula: (base * altura) / 2
 */

public class Exe08
{
    public static void main(String[] args) {
        Float base,altura,area;
        Scanner input;
        input = new Scanner(System.in);

        System.out.print("Insira o valor da base: ");
        base = input.nextFloat();

        System.out.print("Insira o valor da altura: ");
        altura = input.nextFloat();

        area = (base * altura)/2;

        System.out.print("A área do triângulo é : " + area);
    }
}


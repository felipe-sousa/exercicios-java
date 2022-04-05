import java.util.Scanner;

// 21-03-2022
/*
*   Receba o valor depositado, a taxa de juros e exiba na tela o rendimento e o valor total (deposito + rendimento).
 */

public class Exe07
{
    public static void main(String[] args) {
        float valor,taxa;
        Scanner input;
        input = new Scanner(System.in);

        System.out.print("Digite o valor depositado: ");
        valor = input.nextFloat();

        System.out.print("Digite a taxa de juros %: ");
        taxa = input.nextFloat();

        System.out.println("O rendimento é de: " + valor * taxa/100);
        System.out.println("O vaolor total é de: " + (valor + (valor * taxa/100)));
    }
}



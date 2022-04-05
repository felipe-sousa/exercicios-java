import java.util.Scanner;

// 28-03-2022
/*
*   Faça um programa que receba dois números e mostre o maior
 */

public class Exe10
{
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

    }
}


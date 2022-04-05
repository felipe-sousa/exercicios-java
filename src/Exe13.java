import java.util.Scanner;

// 04-04-2022
/*
*    Faça um programa que leia um número N que indica quantos valores inteiros e positivos devem ser lidos a seguir.
*    Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial desse valor.
*/

public class Exe13
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, qtdNum, fat = 1; // Declaração das variáveis utilizadas

        // Solicita o valor N
        System.out.print("Informe quantos valores devem ser digitados: ");
        qtdNum = input.nextInt();

        // Solicita os valores enquanto N for maior que 0
        while (qtdNum > 0) {

            System.out.print("Informe o valor do número a ser fatorado: ");
            num1 = num2 = input.nextInt();

            // Faz o cálculo do fatorial
            while (num2 > 0) {
                fat *= num2--;
            }

            System.out.printf("O fatorial de %d é: %d ", num1, fat);
            System.out.println();

            // Diminui 1 do valor N e zera a variável do resultado da fatorial para calcular novamente
            qtdNum--;
            fat = 1;
        }
    }
}

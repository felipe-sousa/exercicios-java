import java.util.Scanner;

// 04-04-2022
/*
 *   Elabore uma sub-rotina que leia cinco valores inteiros, determine e mostre o maior e o menor deles.
 */

public class Exe14
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior=0,menor=0,num=0;

        //Solicita o primeiro número e atribui a variável Menor
        System.out.print("Digite um número: ");
        menor = input.nextInt();

        // Solicita os outros 4 números e compara se são maiores ou menores que o Menor
        for(int i=0; i<4; i++) {
            System.out.print("Digite um número: ");
            num = input.nextInt();

            if(num > maior) maior = num;
            if (num < menor) menor = num;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}

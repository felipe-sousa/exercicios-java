import java.util.Scanner;

// 28-03-2022
/*
*   Faça um programa que receba quatro valores: I, A, B e C.
*   Desses valores, I é um Inteiro Positivo, A, B e C são Reais.
*   Escreva os números A, B e C obedecendo a tabela a seguir.
*   Suponha que o valor digitado para I seja sempre um valor válido, ou seja, 1, 2
*   ou 3 e que os números reais sejam diferentes um do outro.
*
*   --------------------------------------------------------------
*   |  Valor de I  |              Forma a Escrever               |
*   |      1       |         A, B, C em ordem crescente          |
*   |      2       |        A, B, C em ordem decrescente         |
*   |      3       |  O maior fica entre os outros dois números  |
*   --------------------------------------------------------------
 */

public class Exe11
{
    public static void main(String[] args) {
        int I, A, B, C;                             //Reais A, B e C
        Scanner input = new Scanner(System.in);     //Scanner para entrada do usuário

        //Solicita os valores ao usuário

        System.out.print("Digite o valor de I: (1,2,3) ");
        I = input.nextInt();

        System.out.print("Digite o valor de A: ");
        A = input.nextInt();

        System.out.print("Digite o valor de B: ");
        B = input.nextInt();

        System.out.print("Digite o valor de C: ");
        C = input.nextInt();

        //Faz as validações de A, B e C

        int max = A;
        if ((B > max) || (C > max)) {               //Define A como o valor padrão, e compara se B e C são maiores que A
            if (B > C) {                            //Caso B e C sejam maiores que A, compara se B é maior que C
                max = B;
            } else {
                max = C;
            }
        }

        int min = A;
        if ((B < min) || (C < min)) {               //Define A como o valor padrão, e compara se B e C são menores que A
            if (B < C) {                            //Caso B e C sejam menores que A, compara se B é menor que C
                min = B;
            } else {
                min = C;
            }
        }

        int meio = A + B + C - max - min;       //Calcula o valor do meio somando todos os valores e diminuindo o menor e maior

        //Compara se I é válido (1, 2 ou 3)
        if (I == 1) {
            System.out.printf("Ordem Crescente: %d %d %d%n", min, meio, max);
        } else if (I == 2) {
            System.out.printf("Ordem Decrescente: %d %d %d%n", max, meio, min);
        } else if (I == 3) {
            System.out.printf("O maior fica entre os outros dois valores: %d %d %d%n", min, max, meio);
        } else {
            System.out.println("O valor é inválido para I: " + I);
        }
    }
}



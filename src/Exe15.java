import java.util.Scanner;

// 04-04-2022
/*
 *   Faça um programa contendo uma sub-rotina que receba as três notas de um aluno como parâmetros e uma letra.
 *   Se a letra for A, a sub-rotina deverá calcular a média aritmética das notas do aluno;
 *   Se for P, deverá calcular a média ponderada, com pesos 5, 3 e 2.
 *   A média calculada deverá ser devolvida ao programa principal para, então, ser mostrada.
 */

public class Exe15
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String opcao;
        int nota1,nota2,nota3;

        System.out.print("Digite o valor da primeira nota: ");
        nota1 = input.nextInt();

        System.out.print("Digite o valor da segunda nota: ");
        nota2 = input.nextInt();

        System.out.print("Digite o valor da terceira nota: ");
        nota3 = input.nextInt();

        System.out.println("Agora, escolha a opção desejada: ");
        System.out.println("A - Calcular a Média Aritmética");
        System.out.println("P - Calcular a Média Ponderada");
        opcao = input.next();

        if (opcao.equalsIgnoreCase("A")) System.out.printf("A Média Aritmética das notas é %d", calcularMediaAritmetica(nota1,nota2,nota3));
        else if (opcao.equalsIgnoreCase("P")) System.out.printf("A Média Ponderada das notas é %d", calcularMediaPonderada(nota1,nota2,nota3));
        else System.out.printf("A opção '%s' é inválida.", opcao);

    }

    public static int calcularMediaAritmetica(int n1, int n2, int n3) {
        // Média aritmetica = Soma os valores das notas e divide pela quantidade de notas
        return (n1+n2+n3)/3;
    }

    public static int calcularMediaPonderada(int n1, int n2, int n3) {
        // Média ponderada = Soma o valor da Nota*Peso e depos divide pela soma dos pesos
        // Pesos: 5, 3, 2 respectivamente
        return (n1*5) + (n2*3) + (n3*2) / (5 + 3 + 2);
    }
}
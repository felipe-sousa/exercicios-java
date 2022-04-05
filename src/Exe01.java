import java.util.Scanner;

// 13-03-2022
// Recebe 4 notas e seus respectivos pesos, calcula a Média Ponderada e retorna na tela

public class Exe01
{
    public static void main(String[] args) {

        //Variáveis
        int n1,n2,n3,n4,p1,p2,p3,p4,mp;
        Scanner input = new Scanner(System.in);

        //Coleta as notas
        System.out.print("Digite a primeira nota: ");
        n1 = input.nextInt();

        System.out.print("Digite a segunda nota: ");
        n2 = input.nextInt();

        System.out.print("Digite a terceira nota: ");
        n3 = input.nextInt();

        System.out.print("Digite a quarta nota: ");
        n4 = input.nextInt();

        //Coleta os pesos
        System.out.print("Digite o primeiro peso: ");
        p1 = input.nextInt();

        System.out.print("Digite o segundo peso: ");
        p2 = input.nextInt();

        System.out.print("Digite o terceiro peso: ");
        p3 = input.nextInt();

        System.out.print("Digite o quarto peso: ");
        p4 = input.nextInt();

        //Faz o cálculo e exibe na tela a Média Ponderada
        mp = ((n1*p1) + (n2*p2) + (n3*p3) + (n4*p4)) / (p1 + p2 + p3 + p4);

        System.out.print("A média é: " + mp);

    }
}


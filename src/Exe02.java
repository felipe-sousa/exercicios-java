import java.util.Scanner;

// 13-03-2022
// Recebe o salário e retorna na tela o valor recebido + 25%

public class Exe02
{
    public static void main(String[] args) {

        //Variáveis
        double salario;
        Scanner input = new Scanner(System.in);

        //Coleta o valor atual do salário
        System.out.print("Digite o salário atual: ");
        salario = input.nextFloat();

        //Calcula e exibe na tela o aumento de 25%
        salario = salario + (salario*0.25);
        System.out.print("O novo salário com 25% de aumento é: " + salario);
    }
}

import java.util.Scanner;

// 13-03-2022
/*
*   05)	Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que receba o valor do
*   salário mínimo e a quantidade de quilowatts consumida por uma residência. Calcule e mostre:
*   a)	o valor de cada quilowatt;
*   b)	o valor a ser pago por essa residência;
*   c)	o valor a ser pago com desconto de 15%.
 */

public class Exe05
{
    public static void main(String[] args) {

        //Variáveis
        double valorPagar,salario,kwConsumido,kwValor;
        Scanner input = new Scanner(System.in);

        //Coleta o valor atual do salário
        System.out.print("Digite o salário: ");
        salario = input.nextFloat();

        //Coleta os kW consumidos
        System.out.print("Digite a quantidade de kW gastos: ");
        kwConsumido = input.nextInt();

        //Faz os cálculos e exibe na tela
        kwValor = salario/5;
        System.out.println("Valor por kW: R$ " + kwValor);

        valorPagar = kwValor * kwConsumido;
        System.out.println("Valor Total a Pagar: R$ " + valorPagar);

        valorPagar = valorPagar - (valorPagar*0.15);
        System.out.println("Valor Total a Pagar c/ 15% Desc: R$ " + valorPagar);

    }
}

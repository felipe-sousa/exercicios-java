import java.util.Scanner;

// 13-03-2022
/*
*
*   04)	Você voltou a trabalhar no departamento pessoal de uma empresa e precisa elaborar um programa que receba o
*   número de horas trabalhadas e o valor do salário mínimo, calcule e mostre o salário a receber, seguindo estas regras:
*   a)	A hora trabalhada vale a metade do salário mínimo.
*   b)	O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada.
*   c)	O imposto equivale a 3% do salário bruto.
*   d)	O salário a receber equivale ao salário bruto menos o imposto.
*
*/

public class Exe04
{
    public static void main(String[] args) {

        //Variáveis
        double salario,horasTrab,valorHora;
        Scanner input = new Scanner(System.in);

        //Coleta o valor atual do salário
        System.out.print("Digite o salário mínimo: ");
        salario = input.nextFloat();

        //Coleta a quantidade de horas trabalhadas
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrab = input.nextFloat();

        //Valor da Hora trabalhada
        valorHora = salario / 2;

        //Cálculo do salario líquido:
        //Salário bruto (hrs * valorHora) menos o imposto (3%)
        salario = (horasTrab * valorHora) - ((horasTrab * valorHora)*0.03);


        System.out.print("O salário líquido é: R$ " + salario);
    }
}

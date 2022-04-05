import java.util.ArrayList;
import java.util.Scanner;

// 04-04-2022
/*
*    Elabore um programa que receba uma lista contendo a quantidade de Metros cúbicos de água gastos por consumidor,
*    o tipo de consumidor (1 — residencial; 2 — comercial; ou 3 — industrial) e o valor do salário mínimo e que
*    calcule e mostre:
*    a) o valor de cada Metro cúbico, sabendo que o M3 custa um oitavo do salário mínimo;
*    b) o valor a ser pago por consumidor (conta final mais acréscimo). O acréscimo encontra-se na tabela a seguir:
*    c) o faturamento geral da empresa;
*    d) a quantidade de consumidores que pagam entre R$ 100,00 e R$ 500,00.
 *   Termine a entrada de dados com quantidade de M3 igual a zero.
 *   -------------------------------------------------
 *   |  Tipo  |  % de acréscimo sobre o valor gasto  |
 *   |   1    |                   5                  |
 *   |   2    |                  10                  |
 *   |   3    |                  15                  |
 *   -------------------------------------------------
*/

public class Exe12
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner para entrada de dados
        float salario,valorMetroCubico, metrosGastos, fatGeral, aPagar; // Armazena o salário e Valor do M3 (fixos) e os m3 consumidos
        int contEntre100e500; // Contadores
        int tipoConsumidor; // Armazena os tipos consumidores

        System.out.print("Insira o valor do salário mínimo: ");
        salario = input.nextFloat();

        // Resultado A
        valorMetroCubico = salario/8;
        System.out.println("O valor do M3 é de R$ " + valorMetroCubico);

        // Resultado B
        metrosGastos = 1;
        fatGeral = 0;
        contEntre100e500 = 0;
        while(true) {
            System.out.print("Insira a quantidade de M3 consumidos: ");
            metrosGastos = input.nextFloat();

            if (metrosGastos == 0) break;

            System.out.print("Insira o tipo de Consumidor (1,2,3): ");
            tipoConsumidor = input.nextInt();

            aPagar = metrosGastos * valorMetroCubico;

            if (tipoConsumidor == 1) {
                aPagar += aPagar * 0.05;
                System.out.println("Você deverá pagar R$ " + aPagar);
            }
            else if (tipoConsumidor == 2) {
                aPagar += aPagar * 0.10;
                System.out.println("Você deverá pagar R$ " + aPagar);
            }
            else if (tipoConsumidor == 3) {
                aPagar += aPagar * 0.15;
                System.out.println("Você deverá pagar R$ " + aPagar);
            }
            else {
                System.out.println("Tipo de Consumidor inválido.");
                break;
            }

            if ((aPagar >= 100) && (aPagar <= 500)) {
                contEntre100e500++;
            }

            fatGeral += aPagar;
        }

        // Resultado C
        System.out.println("O faturamento geral da empresa é de R$ " + fatGeral);

        // Resultado D
        System.out.println("A quantidade de consumidores que pagam entre R$ 100 e R$ 500 é de " + contEntre100e500);

    }
}
import java.util.*;

// 21-03-2022
/*
*   Receba o salário do funcionário e calcule conforme abaixo:
*   a. O funcionário recebe uma gratificação de 5% do valor do salário;
*   b. O imposto é equivalente a 7% do salário;
*   c. Exiba o valor líquido a ser recebido pelo funcionário.
 */

public class Exe06
{
    public static void main(String[] args) {
        float sal, salreceber,grat,imp;
        Scanner entrada;
        entrada = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        sal = entrada.nextFloat();

        grat = sal * 5/100;
        imp = sal * 7/100;

        salreceber = sal - imp + grat;

        System.out.println("Novo salário: " + salreceber);
    }
}
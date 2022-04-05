import java.util.*;

// 07-03-2022
//Recebe 4 números com um Scanner e retorna a soma deles

public class Aula01
{
    public static void main(String[] args) {

        int n1,n2,n3,n4,soma;

        Scanner input;
        input = new Scanner(System.in);

        System.out.print("Digite os 4 números a serem somados: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();

        soma = n1 + n2 + n3 + n4;

        System.out.println(soma);
    }
}


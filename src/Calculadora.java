import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;
        double soma, multiplicacao, subtracao, divisao, modulo;

        System.out.println("Digite um número: ");
        numero1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;
        divisao = (double) numero1 / numero2; //O double entre parenteses é um cast no qual transforma um tipo de dado em outro
        modulo = numero1 % numero2; // A porcentagem pega o resto da divisão para lhe dar como resultado.

        System.out.println("O resultado da soma é " + soma);
        System.out.println("O resultado da subtracao é " + subtracao);
        System.out.println("O resultado da multiplicacao é " + multiplicacao);
        System.out.println("O resultado da divisao é " + divisao);
        System.out.println("O resultado da divisao é " + modulo);
        System.out.println("Esta é a classe calculadora");
        System.out.println("Esta é a classe calculadora");
        sc.close();

    }
}

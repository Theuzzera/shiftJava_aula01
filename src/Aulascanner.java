import java.util.Scanner;

public class Aulascanner {
    public static void main(String[] args) {
        // O Scanner serve para solicitar uma entrada de dados no sistema.
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        //Para que o "Scanner" receba a informação deve-se inserir a variável do "Scanner"(leitor) e inserir o "next()"
        // Tudo o que está entre parenteses é um método.
        leitor.next();

        // Precisamos fazer um novo "nextLine()" para consumir a quebra de linha pendente
        leitor.nextLine();


        //Declarar uma variável - > insira o tipo da variável + o nome da variável
        //Variável do tipo String
        String nomeAluno;

        //Para que o "Scanner" receba a informação deve-se inserir a variável + "nextLine()"
        nomeAluno = leitor.nextLine();
        System.out.println("Boa Noite " + nomeAluno + " Seja Bem Vindo ao Shift FIAP");

        // Declarando a variável do tipo inteiro
        // Deve-se inserir o tipo da variável do leito!
        System.out.println("Insira um número qualquer: ");
        int numero = leitor.nextInt();
        System.out.println("O número digitado foi: " + numero);
        leitor.nextLine();
        String nome;
        //Podemos também inserir direto no print o que o usuário digitar
        System.out.println(nome = leitor.nextLine());


        // criando 2 variaveis do tipo inteiro
        int numero1, quadradoDoNumero;

        // Atribuindo um valor na variável "numero1"
        numero1 = leitor.nextInt();

        // Inserindo o valor da variável "numero1" dentro da varável "quadradoDoNumero" e realizando a multiplicação.
        quadradoDoNumero = numero1 * numero1;
        System.out.println("O quadrado do número é: "+quadradoDoNumero);

        leitor.close();
    }
}

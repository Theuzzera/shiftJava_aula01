import java.sql.SQLOutput;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        //Para inserir um comentário devemos inserir o // ou /**/
        // Para exibir algo na tela devemos chamar o método System.out.println("")
        System.out.println("INSERIR TUDO O QUE APRENDI ATÉ O MOMENTO");

        //Tipos de Dados

        // String é do tipo caractere para escrever somente texto
        String caractere;
        System.out.println("variavel de caractere");

        // int serve para escrever números inteiros
        int numero;
        System.out.println("variavel inteira");

        // double serve para escrever números com ponto flutuante
        double numeroFlutuante;
        System.out.println("variavel de ponto flutuante");

        // boolean serve para dados logicos de verdadeiro ou falso
        boolean variavel;
        System.out.println("variavel lógica");

        //PARA LER UM DADO NO JAVA DEVEMOS IMPORTAR A CLASSE SCANNER
        Scanner sc = new Scanner(System.in);

        System.out.println("insert a value here");
        System.out.println(sc.nextLine());

        System.out.println("variavel de caractere");
        caractere = sc.nextLine();

        System.out.println("variavel inteira");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("variavel de ponto flutuante");
        numeroFlutuante = sc.nextDouble();
        sc.nextLine();
        sc.next();



    }
}

import java.util.Scanner;

public class aulaScannerComplementar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3, s4, s5;
        int numero, numero2;

        //Quando utilizamos um comando de leitura de dados diferente do "nextline()" essa quebra de linha fica pendente na entrada padrão
        numero = sc.nextInt();
        // Logo precisamos fazer um novo "nextLine()" para consumir a quebra de linha pendente
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        s4 = sc.next();
        sc.nextLine();
        numero2 = sc.nextInt();
        sc.nextLine();
        s5 = sc.nextLine();


        System.out.println(numero);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(numero2);
        System.out.println(s5);

        sc.close();


    }
}

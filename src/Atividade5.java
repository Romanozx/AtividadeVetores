import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];
        System.out.println("Insira um nome:");
        nomes[0] = sc.nextLine();
        System.out.println("Insira um nome:");
        nomes[1] = sc.nextLine();
        System.out.println("Insira um nome:");
        nomes[2] = sc.nextLine();

        //exibir os nomes

        System.out.println("Nome 1:" + nomes[0]);
        System.out.println("Nome 2:" + nomes[1]);
        System.out.println("Nome 3:" + nomes[2]);

        sc.close();
    }
}
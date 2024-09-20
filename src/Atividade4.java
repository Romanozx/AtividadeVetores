import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        // pedir os valores e armazena
        System.out.println("Insira um numero: ");
        numeros[0] = sc.nextInt();
        System.out.println("Insira um numero: ");
        numeros[1] = sc.nextInt();
        System.out.println("Insira um numero: ");
        numeros[2] = sc.nextInt();

        // mostra os valores
        System.out.println("valor 1: " + numeros[0]);
        System.out.println("valor 2: " + numeros[1]);
        System.out.println("valor 3: " + numeros[2]);

        //media dos valores
        double media = (numeros[0] + numeros[1] + numeros[2]) / 3.0;
        System.out.println("media: " + media);

        sc.close();
    }
}
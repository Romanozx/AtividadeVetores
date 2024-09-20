public class Atividade3 {
    public static void main(String[] args) {

        int[] valores = new int[2];

        valores[0] = 5;
        valores[1] = 10;

        System.out.println("Valores antes da troca");
        System.out.println("Valor 1: " + valores[0]);
        System.out.println("Valor 2: " + valores[1]);


        int valor1 = valores[0];

        valores[0] = valores[1];
        valores[1] = valor1;

        System.out.println("Valor depois da troca");
        System.out.println("Valor 1: " + valores[0]);
        System.out.println("Valor 2: " + valores[1]);

    }
}
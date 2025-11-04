import java.util.Scanner;

public class Atv_6 {
    public static void main(String[] args) {

        // Declarando variavel Scanner
        Scanner sc = new Scanner(System.in);

        // Declarando vetor e média
        double[] numeros = new double[8];

        // Criando loop para armazenar valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = sc.nextDouble();
            System.out.println("------------------");
        }
        // Imprimindo valores inversos
        for (int j= numeros.length-1; j>=0; j-- ) {
            System.out.println(numeros[j]);
        }
        sc.close();
    }
}
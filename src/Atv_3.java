import java.util.Scanner;

public class Atv_3 {
    public static void main(String[] args) {

        // Declarando variavel Scanner
        Scanner sc = new Scanner(System.in);

        // Declarando vetor e média
        double[] numeros = new double[5];
        double total = 0;
        double media = 0.0;

        // Criando loop para armazenar valores
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Digite o número "+(i+1));
            numeros[i] = sc.nextDouble();
            System.out.println("------------------");
            total += numeros[i];
        }

        // Imprimindo resultado
        media = total/numeros.length;
        System.out.println("A média das notas é: " + media);
        sc.close();
    }
}

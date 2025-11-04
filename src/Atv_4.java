import java.util.Scanner;

public class Atv_4 {
    public static void main(String[] args) {

        // Declarando variavel Scanner
        Scanner sc = new Scanner(System.in);

        // Declarando vetor
        int[] numeros = new int[10];

        // Obtendo valores com um loop
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Digite o número "+(i+1));
            numeros[i]=sc.nextInt();
            System.out.println("---------------------");
        }
        // Verificando o maior número com if/else
        int maiorNum = numeros[0];

        for (int j=0; j<numeros.length; j++) {
            if (numeros[j] > maiorNum) {
                maiorNum = numeros[j];
            }
        }
        sc.close();
        // Imprimindo resultado
        System.out.println(maiorNum);
    }
}

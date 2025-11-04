import java.util.Scanner;
public class Atv_8 {
    public static void main(String[] args) {

        // Declarando variavel Scanner
        Scanner sc = new Scanner(System.in);

        // Declarando vetores
        int[] num1 = new int[5];
        int[] num2 = new int[5];

        // Obtendo valores
        for (int i=0; i<num1.length; i++) {
            System.out.println("Digite o número "+(i+1));
            num1[i]=sc.nextInt();
            System.out.println("---------------------");
        }
        // Imprimindo valores lado a lado
        for (int j=0; j<num1.length; j++) {
            num2[j] = num1[j]*2;
            System.out.println(num1[j] + " | " + num2[j]);
        }
        sc.close();
    }
}

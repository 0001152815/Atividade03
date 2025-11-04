import java.util.Scanner;

public class Atv_1 {
    public static void main(String[] args) {
        
        // Declarando variavel Scanner
        Scanner sc = new Scanner(System.in);

        // Declarando vetor
        int[] numeros = new int [5];

        // Gerando loop para armazenar valores
        for ( int i=0; i<numeros.length; i++) {
            System.out.println("Digite o número "+(i+1));
            numeros[i]=sc.nextInt();
            System.out.println("---------------");
        }
        sc.close();

        //imprimindo valores
        for (int j=0; j<numeros.length; j++) {
            System.out.println(numeros[j]);
        }

        }
    }

import java.util.Scanner;

public class Atv_2 {
    public static void main(String[] args) {

        // Declarando a variavel Scanner
        Scanner sc = new Scanner(System.in);

        // Declarando vetor e soma
        int[] numeros = new int[5];
        int soma = 0;

        // Criando loop para armazenar e somar valores
        for (int i=0; i< numeros.length; i++) {
            System.out.println("Digite o número "+(i+1));
            numeros[i] = sc.nextInt();
            System.out.println("----------------");
            soma += numeros[i];
        }
        sc.close();
        System.out.println(soma);
    }
}

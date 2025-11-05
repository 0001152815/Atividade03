import java.util.Scanner;
import java.util.Arrays;

public class Atv_10 {

    public static void main(String[] args) {

        // Define o tamanho dos vetores iniciais
        final int TAMANHO = 5;

        // 1. Inicialização
        Scanner scanner = new Scanner(System.in);

        // Cria os três vetores
        int[] vetorA = new int[TAMANHO];
        int[] vetorB = new int[TAMANHO];

        // O terceiro vetor precisa ter o dobro do tamanho
        int[] vetorC = new int[TAMANHO * 2];

        // 2. Pedir os números do primeiro vetor (vetorA)
        System.out.println("--- Primeiro Vetor ---");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        // 3. Pedir os números do segundo vetor (vetorB)
        System.out.println("\n--- Segundo Vetor ---");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

        // 4. Criar o terceiro vetor (vetorC)

        // Copia os 5 valores do vetorA para as primeiras 5 posições do vetorC
        for (int i = 0; i < TAMANHO; i++) {
            vetorC[i] = vetorA[i];
        }

        // Copia os 5 valores do vetorB para as 5 posições restantes do vetorC
        // (Note que o índice de 'vetorC' começa de 'TAMANHO')
        for (int i = 0; i < TAMANHO; i++) {
            vetorC[i + TAMANHO] = vetorB[i];
        }

        // 5. Exibir o vetor resultante
        System.out.println("\n--- Vetor Resultante (Vetor C) ---");

        // Arrays.toString() é um método prático para exibir vetores
        System.out.println(Arrays.toString(vetorC));

        // Fechar o scanner
        scanner.close();
    }
}
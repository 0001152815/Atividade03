import java.util.Scanner;

public class Atv_9 {

    public static void main(String[] args) {

        // 1. Inicialização
        // Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Criação do *único* vetor para armazenar os 10 números
        int[] numeros = new int[10];

        System.out.println("Por favor, digite 10 números (positivos ou negativos):");

        // 2. Loop para solicitar os 10 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            // Armazena cada número lido no vetor
            numeros[i] = scanner.nextInt();
        }

        // 3. Loop para exibir apenas os positivos (sem criar outro vetor)
        System.out.println("\n--- Apenas os números positivos ---");

        // Percorre o *mesmo* vetor que já foi preenchido
        for (int i = 0; i < numeros.length; i++) {

            // Verifica se o número na posição atual é maior que zero
            if (numeros[i] > 0) {
                // Se for positivo, exibe o número
                System.out.println(numeros[i]);
            }
            // Se for negativo ou zero, ele é simplesmente ignorado.
        }

        // Boa prática: fechar o scanner ao terminar
        scanner.close();
    }
}

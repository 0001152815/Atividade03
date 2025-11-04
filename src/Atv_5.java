import java.util.Scanner;

public class Atv_5 {

    public static void main(String[] args) {

        // 1. Inicializa o Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // 2. Cria um vetor para armazenar os 10 números inteiros
        int[] numeros = new int[10];

        // 3. Cria as variáveis para contar os pares e ímpares
        int totalPares = 0;
        int totalImpares = 0;

        System.out.println("Digite 10 números inteiros:");

        // 4. Loop para ler os 10 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");

            // Armazena o número no vetor
            numeros[i] = sc.nextInt();

            // 5. Verifica se o número é par ou ímpar (logo após ler)

            if (numeros[i] % 2 == 0) {
                // Se o resto da divisão por 2 for 0, é par
                totalPares++; // Incrementa o contador de pares
            } else {
                // Se não, é ímpar
                totalImpares++; // Incrementa o contador de ímpares
            }
        }

        // 6. Imprime os resultados finais
        System.out.println("\n--- ANÁLISE CONCLUÍDA ---");
        System.out.println("Total de números PARES: " + totalPares);
        System.out.println("Total de números ÍMPARES: " + totalImpares);

        // 7. Fecha o scanner (boa prática)
        sc.close();
    }
}

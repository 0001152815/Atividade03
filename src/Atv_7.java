import java.util.Scanner;

public class Atv_7 {
    public static void main(String[] args) {

        // Declarando variavel Scanner
        Scanner sc = new Scanner(System.in);

        // Declarando variaveis
        String[] nomes = new String[10];


        // Criando loop para armazenar valores
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o " + (i + 1) + "◦" + " nome");
            nomes[i] = sc.next();
            System.out.println("------------------");
        }
        // Rastreando o nome
        System.out.println("Digite um nome");
        sc.nextLine();
        String nome = sc.nextLine();

        boolean achou = false;

        for (int j=0; j< nomes.length; j++) {
            if (nomes[j].equals(nome)) {
                achou = true;
                break;
            }
        }
        if (achou) {
            System.out.println("Seu nome está presente na lista.");
        } else {
            System.out.println("Não está presente na lista.");
        }
        sc.close();
    }
}

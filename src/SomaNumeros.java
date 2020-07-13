import java.util.Scanner;

public class SomaNumeros {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Qual a soma?\nDigite os números que deverão ser somados.\nPara terminar, digite 0:");
        somar();
    }

    private static void somar() {
        int soma = 0;
        int numeroASomar = scanner.nextInt();
        while (numeroASomar != 0) {
            soma += numeroASomar;
            numeroASomar = scanner.nextInt();
        }
        System.out.println("A soma dos números digitados é: "+soma);
    }
}

package ordenacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor:");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        System.out.println("Informe os valores do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("\nEscolha um método de ordenação:"); // para o usuário escolher o modo de ordenação que deseja utilizar //
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Selection Sort");
            System.out.println("3 - Insertion Sort");
            System.out.println("4 - Quick Sort");
            System.out.println("5 - Merge Sort");
            System.out.println("6 - Heap Sort");
            System.out.println("7 - Sair");
            int escolha = scanner.nextInt();

            if (escolha == 7) {
                break;
            }

            int[] vetorParaOrdenar = vetor.clone(); // Clone para não perder os dados originais

            switch (escolha) {
                case 1:
                    Bubble.sort(vetorParaOrdenar);
                    break;
                case 2:
                    Select.sort(vetorParaOrdenar);
                    break;
                case 3:
                    Insert.sort(vetorParaOrdenar);
                    break;
                case 4:
                    Quick.sort(vetorParaOrdenar, 0, vetorParaOrdenar.length - 1);
                    break;
                case 5:
                    Merge.sort(vetorParaOrdenar);
                    break;
                case 6:
                    Heap.sort(vetorParaOrdenar);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("Vetor ordenado: " + java.util.Arrays.toString(vetorParaOrdenar));
        }

        scanner.close();
    }
}

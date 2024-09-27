package ordenacao;

public class Heap {
    public static void sort(int[] arr) {
        int n = arr.length; // Obtém o tamanho do vetor
        int passagens = 0; // Contador de passagens

        // Constrói um heap (árvore binária) max
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Um a um, extrai elementos do heap
        for (int i = n - 1; i > 0; i--) {
            passagens++; // Incrementa o contador de passagens
            // Move o elemento atual (raiz do heap) para o final do vetor
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Chama heapify na árvore reduzida
            heapify(arr, i, 0);
            // Exibe o vetor após cada extração
            System.out.println(java.util.Arrays.toString(arr));
        }
        // Mostra o total de passagens
        System.out.println("Total de passagens: " + passagens);
    }

    // Função que transforma um vetor em um heap max
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Inicializa o maior como raiz
        int left = 2 * i + 1; // Filho à esquerda
        int right = 2 * i + 2; // Filho à direita

        // Se o filho à esquerda for maior que a raiz
        if (left < n && arr[left] > arr[largest]) {
            largest = left; // Atualiza o maior
        }

        // Se o filho à direita for maior que o maior até agora
        if (right < n && arr[right] > arr[largest]) {
            largest = right; // Atualiza o maior
        }

        // Se o maior não for a raiz
        if (largest != i) {
            // Troca a raiz com o maior
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Recursivamente transforma o sub-heap em um heap
            heapify(arr, n, largest);
        }
    }
}

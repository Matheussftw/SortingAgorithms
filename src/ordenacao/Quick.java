package ordenacao;

public class Quick {
    public static void sort(int[] arr, int low, int high) {
        int passagens = 0; // Contador de passagens
        if (low < high) {
            // Particiona o vetor
            int pi = partition(arr, low, high);
            // Ordena recursivamente as duas metades
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
        // Exibe o vetor após cada chamada de sort
        System.out.println(java.util.Arrays.toString(arr));
        passagens++; // Incrementa o contador de passagens
        // Mostra o total de passagens
        System.out.println("Total de passagens: " + passagens);
    }

    // Função que particiona o vetor e coloca o pivô na posição correta
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivô é o último elemento
        int i = (low - 1); // Índice do menor elemento
        // Reorganiza o vetor
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Troca arr[i] e arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Coloca o pivô na posição correta
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Retorna a posição do pivô
    }
}

package ordenacao;

public class Merge {
    public static void sort(int[] arr) {
        // Se o vetor tem menos de dois elementos, já está ordenado
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2; // Encontra o ponto médio
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Copia os elementos para os sub-vetores
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        // Ordena recursivamente os sub-vetores
        sort(left);
        sort(right);
        // Mescla os sub-vetores de volta no vetor original
        merge(arr, left, right);
        // Exibe o vetor após cada mesclagem
        System.out.println(java.util.Arrays.toString(arr));
    }

    // Função que mescla dois sub-vetores em um vetor
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int passagens = 0; // Contador de passagens

        // Mescla os elementos em ordem
        while (i < left.length && j < right.length) {
            passagens++; // Incrementa o contador de passagens
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        // Copia os elementos restantes do vetor esquerdo
        while (i < left.length) {
            passagens++; // Incrementa o contador de passagens
            arr[k++] = left[i++];
        }
        // Copia os elementos restantes do vetor direito
        while (j < right.length) {
            passagens++; // Incrementa o contador de passagens
            arr[k++] = right[j++];
        }
        // Mostra o total de passagens
        System.out.println("Total de passagens: " + passagens);
    }
}

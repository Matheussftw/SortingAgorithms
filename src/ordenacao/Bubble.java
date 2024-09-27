package ordenacao;

public class Bubble {
    public static void sort(int[] arr) {
        int n = arr.length; // Obtém o tamanho do vetor
        boolean swapped; // Variável para verificar se houve troca
        int passagens = 0; // Contador de passagens

        // O algoritmo faz n-1 passagens pelo vetor
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Inicializa como não trocado
            passagens++; // Incrementa o contador de passagens

            // Compara elementos adjacentes
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca os elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Marca que houve uma troca
                }
                // Exibe o vetor após cada comparação
                System.out.println(java.util.Arrays.toString(arr));
            }
            // Se não houve trocas nesta passagem, o vetor já está ordenado
            if (!swapped) break;
        }
        // Mostra o total de passagens
        System.out.println("Total de passagens: " + passagens);
    }
}

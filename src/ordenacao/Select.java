package ordenacao;

public class Select {
    public static void sort(int[] arr) {
        int n = arr.length; // Obtém o tamanho do vetor
        int passagens = 0; // Contador de passagens

        // Passa por cada elemento do vetor
        for (int i = 0; i < n - 1; i++) {
            passagens++; // Incrementa o contador de passagens
            int minIndex = i; // Procura e Assume que o menor é o primeiro não ordenado

            // Encontra o menor elemento na parte não ordenada
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Atualiza o índice do menor elemento
                }
            }

            // Troca o menor elemento encontrado com o primeiro elemento não ordenado
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            // Exibe o vetor após cada passagem
            System.out.println(java.util.Arrays.toString(arr));
        }
        // Mostra o total de passagens
        System.out.println("Total de passagens: " + passagens);
    }
}

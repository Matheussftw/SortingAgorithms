package ordenacao;

public class Insert {
    public static void sort(int[] arr) {
        int n = arr.length; // Obtém o tamanho do vetor
        int passagens = 0; // Contador de passagens

        // Passa pelo vetor, começando do segundo elemento
        for (int i = 1; i < n; ++i) {
            passagens++; // Incrementa o contador de passagens
            int key = arr[i]; // Elemento a ser inserido
            int j = i - 1;
            // Move os elementos que são maiores que a chave para uma posição à frente
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Desloca o elemento (move o elemento para posição adequada)
                j = j - 1;
            }
            arr[j + 1] = key; // Insere a chave na posição correta (elemento que foi comparado e dado como menor)
            // Exibe o vetor após cada inserção
            System.out.println(java.util.Arrays.toString(arr));
        }
        // Mostra o total de passagens
        System.out.println("Total de passagens: " + passagens);
    }
}

public class OrdenamientoShell {

    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        
        System.out.println("Arreglo antes de ordenar:");
        imprimirArreglo(arr);
        
        shellSort(arr);
        
        System.out.println("Arreglo después de ordenar:");
        imprimirArreglo(arr);
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        
        // Inicializar el tamaño de la brecha (gap)
        int gap = n / 2;
        
        // Realizar el ordenamiento con brechas decrecientes
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i]; //Guarda el elemento en la posicion del gap
                int j = i; //Guarda el gap
                
                // Realizar la inserción con brecha
                while (j >= gap && arr[j - gap] > temp) { //Compara un salto hacia atrás según la brecha actual
                    arr[j] = arr[j - gap]; //Cambio de elemento
                    j -= gap; //Cambio le saco gap a J
                }
                arr[j] = temp; //Cambio el otro elemento
            }
            
            // Reducir el gap
            gap /= 2;
        }
    }

    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

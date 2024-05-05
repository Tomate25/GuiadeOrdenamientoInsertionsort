public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenamiento por insercion");
        
        int[] arr = {12, 11, 13, 5, 6}; // Este es el arreglo desordenado

        System.out.println("Arreglo original");
        for (int num : arr) { 
            System.out.println(num + "");
        }

        System.out.println();
        System.out.println("================================");
        insertionSort(arr); // Llamado del metodo de ordenamiento por insercion

        System.out.println("Arreglo ordenado");
        for (int num : arr) {
            System.out.println(num + "");
        }
    }

    public static void insertionSort(int[]arr){
        for (int i = 1; i < arr.length; i++) { // Selecionamos el elemento a insertar en su posicion correcta
            int key = arr[i];
            int j = i-1;
            //  Movemos los elementos mayores que key a una posicion adelante de su posicion
            // actual
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insertamos key en su posicion correcta
        }
        
    }
}

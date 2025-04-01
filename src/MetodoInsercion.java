public class MetodoInsercion {
    public static void ordenarAscendente(int[] arreglo, boolean ascendente, boolean pasos){
        int comparaciones = 0;
        int cambios = 0;
        int n = arreglo.length;

        for(int i = 1; i < n; i++){
            int key = arreglo[i];
            int j = i - 1;

            while(j >= 0){
                comparaciones++;
                boolean condition = ascendente ? arreglo[j] > key : arreglo[j] < key;
                if(!condition) break;
                arreglo[j + 1] = arreglo[j];
                cambios++;
                if(pasos){
                    System.out.println("Comparación " + comparaciones + ": " + arreglo[j] + (ascendente ? ">" : "<") + key);
                    System.out.println("Desplazamiento: " + arreglo[j] + "a posicion" + (j + 1));
                    System.out.println("Estado actual -> " + arrayToString(arreglo));
                }
                j--;
            }
            arreglo[j + 1] = key;
            if(pasos){
                System.out.println("Insercion: " + key + "en posicion " + (j + 1));
                System.out.println("Estado actual -> " + arrayToString(arreglo));
            }
        }
        System.out.println("--FIN DEL MÉTODO--");
        System.out.println("Arreglo ordenado -> " + arrayToString(arreglo));
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
    }
    
    
    public static void imprimirArreglo(int[] arreglo){
        System.out.println(arrayToString(arreglo));
    }

    private static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
}

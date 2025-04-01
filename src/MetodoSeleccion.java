public class MetodoSeleccion {
    public static void ordenarAscendente(int[] arreglo, boolean ascendente, boolean pasos){
        int comparaciones = 0;
        int cambios = 0;
        int n = arreglo.length;

        for(int i = 0; i < n - 1; i++){
            int minMaxIdx = i;
            for(int j = i + 1; j < n; j++){
                comparaciones++;
                boolean condition = ascendente ? arreglo[j] < arreglo[minMaxIdx] : arreglo[j] > arreglo[minMaxIdx];
                if(condition){
                    minMaxIdx = j;
                }
            }
            if(minMaxIdx != i){
                int temp = arreglo[i];
                arreglo[i] = arreglo[minMaxIdx];
                arreglo[minMaxIdx] = temp;
                cambios++;
                if(pasos){
                    System.out.println("Comparación " + comparaciones + ": Encontrado " + (ascendente ? "minimo" : "maximo") + " " + arreglo[i] + " en posicion " + minMaxIdx);
                    System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[minMaxIdx]);
                    System.out.println("Estado actual -> " + arrayToString(arreglo));
                }
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

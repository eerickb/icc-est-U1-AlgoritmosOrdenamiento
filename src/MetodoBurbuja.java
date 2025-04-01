public class MetodoBurbuja {
    public static void ordenarAscendente(int[] arreglo, boolean ascendente, boolean pasos){
        int comparaciones = 0;
        int cambios = 0;
        int n = arreglo.length;

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                comparaciones++;
                boolean swapNeeded = ascendente ? arreglo[j] < arreglo[j + 1] : arreglo[j] < arreglo[j + 1];
                if(swapNeeded){
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    cambios++;
                    if (pasos){
                        System.out.println("Comparación " + comparaciones + ": " + arreglo[j + 1] + (ascendente ? " > " : " < ") + arreglo[j]);
                        System.out.println("Intercambio: " + arreglo[j + 1] + " <-> " + arreglo[j]);
                        System.out.println("Estado actual -> " + arrayToString(arreglo));
                    }
                }
            }
        }
        System.out.println("--FIN DEL MÉTODO--");
        System.out.println("Arreglo ordenado -> " + arrayToString(arreglo));
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
    }

    public static void imprimirArreglo(int [] arreglo){
        System.out.println(arrayToString(arreglo));
    }

    private static String arrayToString(int [] arr){
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
}

public class App {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean continuar = true;

        while (continuar){
            System.out.println("Seleccione el metodo de ordenamiento:");
            System.out.println("1.Burbuja");
            System.out.println("2.Seleccion");
            System.out.println("3.Insercion");
            System.out.println("4.Burbuja Mejorado");
            System.out.println("5.Salir");
            int opcion = scanner.nextInt();

            if (opcion == 5){
                System.out.println("Saliendo...");
                continuar = false;
                break;
            }

            System.out.println("¿Desea ver los pasos? (true/false):");
            boolean pasos = scanner.nextBoolean();

            System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?:");
            String order = scanner.next();
            boolean ascendente = order.equalsIgnoreCase("A");

            int[] arreglo = {9,10,5,21,15,2,-1,0};
            System.out.println("Arreglo original:" + arrayToString(arreglo));

            switch (opcion){
                case 1:
                    MetodoBurbuja.ordenarAscendente(arreglo, ascendente, pasos);
                    break;
                case 2:
                    MetodoSeleccion.ordenarAscendente(arreglo, ascendente, pasos);
                    break;
                case 3:
                    MetodoInsercion.ordenarAscendente(arreglo, ascendente, pasos);
                    break;
                case 4:
                    MetodoBurbujaMejorado.ordenarAscendente(arreglo, ascendente, pasos);
                default:
                    System.out.println("Opcion invalida.");
            }
        }
        scanner.close();
    }
    private static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        for (int num : arr){
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
}
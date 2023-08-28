import java.util.Scanner;

public class Hueso_CuñaEsferica {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double area, volumen, radio;
        int numeroGrados;

        System.out.println("INGRESE EL RADIO");
        radio = lector.nextDouble();

        System.out.println("INGRESE EL NUMERO DE GRADOS");
        numeroGrados = lector.nextInt();

        // PROCESANDO DATOS DE ENTRADA

        area = (4 * 3.1416 * radio * radio * numeroGrados) / 360;
        volumen = 4 / 3 * (3.1416 * radio * radio * radio * numeroGrados) / 360;

        // RESULTADOS

        System.out.println("EL AREA ES: " + area);
        System.out.println("EL VOLUMEN ES :" + volumen);
        lector.close();

    }
}
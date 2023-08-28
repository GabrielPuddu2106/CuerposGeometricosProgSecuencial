import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double area, volumen, radio;

        System.out.println("INGRESE EL RADIO");
        radio = lector.nextDouble();

        // OPERACIONES
        area = (4 * 3.1416 * radio * radio);
        volumen = (4 / 3 * 3.1416 * radio * radio * radio);

        // RESULTADOS
        System.out.println("EL AREA ES DE: " + area);
        System.out.println("EL VOLUMEN ES DE: " + volumen);
        lector.close();
    }
}
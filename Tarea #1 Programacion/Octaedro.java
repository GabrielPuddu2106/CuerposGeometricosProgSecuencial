import java.util.Scanner;

public class Octaedro {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double area, volumen;
        int aristas;

        System.out.println("INGRESE LAS ARISTAS");
        aristas = lector.nextInt();

        // OPERACIONES
        area = (2 * Math.pow(aristas, 2) * Math.sqrt(3));
        volumen = Math.sqrt(2) / 3 * Math.pow(aristas, 3);

        // RESULTADOS
        System.out.println("EL AREA ES DE: " + area);
        System.out.println("EL VOLUMEN ES DE: " + volumen);
        lector.close();
    }
}
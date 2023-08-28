import java.util.Scanner;

public class Icosaedro {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double area, volumen;
        int arista;

        System.out.println("INGRESE LAS ARISTAS");
        arista = lector.nextInt();

        // OPERACIONES
        area = 5 * Math.pow(arista, 2) * Math.sqrt(3);
        volumen = 5 / 12 * (3 + Math.sqrt(5)) * Math.pow(arista, 3);

        // RESULTADOS
        System.out.println("EL AREA ES DE:" + area);
        System.out.println("EL VOLUMEN ES:" + volumen);

        lector.close();
    }
}
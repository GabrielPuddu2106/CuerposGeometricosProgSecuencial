import java.util.Scanner;

public class Dodecaedro {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double area, volumen;
        int arista;

        System.out.println("INGRESE LAS ARISTAS");
        arista = lector.nextInt();

        // OPERACIONES
        area = 3 * Math.pow(arista, 2) * Math.sqrt(25 + 10 * Math.sqrt(5));
        volumen = 1 / 4 * (15 + 7 * Math.sqrt(5)) * Math.pow(arista, 3);

        // RESULTADOS
        System.out.println("EL AREA ES DE:" + area);
        System.out.println("EL VOLUMEN ES:" + volumen);
        lector.close();
    }
}
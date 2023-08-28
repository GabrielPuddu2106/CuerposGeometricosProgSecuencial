import java.util.Scanner;

public class Hexaedro {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double area, volumen, diametro;
        int arista;

        System.out.println("INGRESE LAS ARISTAS");
        arista = lector.nextInt();

        // OPERACIONES
        area = 6 * Math.pow(arista, 2);
        volumen = Math.pow(arista, 3);
        diametro = arista * Math.sqrt(3);

        // RESULTADOS
        System.out.println("EL AREA ES DE:" + area);
        System.out.println("EL VOLUMEN ES:" + volumen);
        System.out.println("EL DIAMETRO ES:" + diametro);
        lector.close();
    }
}
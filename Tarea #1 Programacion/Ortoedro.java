import java.util.Scanner;

public class Ortoedro {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double area, diametro, volumen, baseMenor;
        int caras;
        final int aristas = 8;

        // DATOS DE ENTRADA
        System.out.println("INGRESE  LA BASE MENOR");
        baseMenor = lector.nextDouble();

        System.out.println("INGRESE LAS CARAS");
        caras = lector.nextInt();

        // OPERACIONES

        area = 2 * (aristas * baseMenor + aristas * caras + baseMenor * caras);
        diametro = Math.sqrt(aristas * aristas + baseMenor * baseMenor + caras * caras);
        volumen = aristas * baseMenor * caras;

        // RESULTADOS

        System.out.println("EL AREA ES DE: " + area);
        System.out.println("EL DIAMETRO ES:" + diametro);
        System.out.println("EL VOLUMEN ES DE:" + volumen);
        lector.close();
    }
}
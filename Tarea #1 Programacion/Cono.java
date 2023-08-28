import java.util.Scanner;

public class Cono {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double radio, altura, generatriz;
        double areaLateral, areaTotal, volumen;

        System.out.println("INGRESE EL RADIO");
        radio = lector.nextDouble();

        System.out.println("INGRESE LA ALTURA");
        altura = lector.nextDouble();

        System.out.println("INGRESE LA GENERATRIZ");
        generatriz = lector.nextDouble();

        // PROCESANDO DATOS DE ENTRADA

        areaLateral = (3.1416 * radio * generatriz);
        areaTotal = 3.1416 * radio * (generatriz + radio);
        volumen = (3.1416 * radio * radio * altura) / 3;

        // RESULTADOS
        System.out.println("EL AREA LATERAL ES:" + areaLateral);
        System.out.println("EL AREA TOTAL ES:" + areaTotal);
        System.out.println("EL VOLUMEN ES DE:" + volumen);
        lector.close();
    }
}
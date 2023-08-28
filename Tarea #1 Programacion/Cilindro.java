import java.util.Scanner;

public class Cilindro {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double areaLateral, altura, radio, areaTotal, volumen;

        System.out.println("Ingrese el Radio");
        radio = lector.nextDouble();

        System.out.println("Ingrese la altura");
        altura = lector.nextDouble();

        // PROCESANDO DATOS DE ENTRADA
        areaLateral = 2 * (3.1416) * radio * altura;
        areaTotal = 2 * (3.1416) * radio * (altura + radio);
        volumen = (3.1416) * radio * radio * altura;

        System.out.println("EL AREA LATERAL ES:" + areaLateral);
        System.out.println("EL VOLUMEN ES:" + volumen);
        System.out.println("EL AREA TOTAL ES:" + areaTotal);
        lector.close();
    }
}
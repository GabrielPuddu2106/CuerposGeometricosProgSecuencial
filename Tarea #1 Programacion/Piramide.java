import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double areaLateral, areaTotal, volumen;
        double pBase, apotema, areaBase, altura;
        int lados, base;

        System.out.println("INGRESE LOS LADOS");
        lados = lector.nextInt();

        System.out.println("INGRESE LA ALTURA");
        altura = lector.nextDouble();

        // PROCESANDO DATOS DE ENTRADA

        base = lados + lados + lados + lados;
        pBase = base + base + base + base;
        apotema = lados / 2;
        areaLateral = (pBase * apotema) / 2;
        areaBase = lados * 2;
        areaTotal = areaLateral + areaBase;
        volumen = (areaBase * altura) / 3;

        // RESULTADOS

        System.out.println("EL AREA LATERAL ES:" + areaLateral);
        System.out.println("EL AREA BASE ES: " + areaBase);
        System.out.println("EL VOLUMEN ES: " + volumen);
        lector.close();
    }
}
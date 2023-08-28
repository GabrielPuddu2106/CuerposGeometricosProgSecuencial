import java.util.Scanner;

public class ZonaEsferica {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double area, volumenZona, volumen;
        double altura, radioMenor, radioMayor;

        System.out.println("INGRESE LA ALTURA");
        altura = lector.nextDouble();

        System.out.println("INGRESE EL RADIO MENOR");
        radioMenor = lector.nextDouble();

        System.out.println("INGRESE EL RADIO MAYOR");
        radioMayor = lector.nextDouble();
        // PROCESANDO DATOS DE ENTRADA

        area = (2 * 3.1416 * radioMayor * radioMenor);
        volumenZona = 3.1416 * altura * (altura * altura + 3 * radioMenor * radioMenor * 3 * radioMenor * radioMenor);

        // RESULTADOS

        System.out.println("EL AREA DE LA ZONA Y CASQUESTE ES: " + area);
        System.out.println("EL VOLUMEN DE LA ZONA ESFERICA ES:" + volumenZona);
        lector.close();

    }
}
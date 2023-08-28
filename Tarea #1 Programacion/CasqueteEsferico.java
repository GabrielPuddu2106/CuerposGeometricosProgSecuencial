import java.util.Scanner;

public class CasqueteEsferico {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double area, volumenCasquete;
        double altura, radioMayor, radioMenor;

        System.out.println("INGRESE LA ALTURA");
        altura = lector.nextDouble();

        System.out.println("INGRESE EL RADIO MAYOR");
        radioMayor = lector.nextDouble();

        System.out.println("INGRESE EL RADIO MENOR");
        radioMenor = lector.nextDouble();

        // PROCESANDO DATOS DE ENTRADA

        area = (2 * 3.1416 * radioMayor * radioMenor);
        volumenCasquete = 3.1416 * altura * altura * (3 * radioMayor - altura) / 3;

        // RESULTADOS

        System.out.println("EL AREA DE LA ZONA Y CASQUESTE ES: " + area);
        System.out.println("EL VOLUMEN DEL CASQUETE ESFERICO ES: " + volumenCasquete);
        lector.close();

    }
}
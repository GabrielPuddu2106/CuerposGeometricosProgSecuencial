import java.util.Scanner;

public class TroncoDeCono {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double areaLateral, volumen, areaTotal;
        double radioMayor, radioMenor, altura, generatriz;
        final double pii = 3.1416;

        System.out.println("INGRESE EL RADIO MAYOR");
        radioMayor = lector.nextDouble();

        System.out.println("INGRESE EL RADIO MENOR");
        radioMenor = lector.nextDouble();

        System.out.println("INGRESE LA ALTURA");
        altura = lector.nextDouble();

        // OPERACIONES
        generatriz = Math.sqrt(Math.pow(altura, 2) + (radioMayor - radioMenor * 2));
        areaLateral = pii * (radioMayor + radioMenor);
        areaTotal = areaLateral + radioMayor + radioMenor;
        volumen = (1 / 3 * pii * altura * (radioMayor * radioMayor) + (radioMenor * radioMenor)
                + radioMayor * radioMenor);

        // RESULTADOS
        System.out.println("EL AREA LATERAL ES DE:" + areaLateral);
        System.out.println("EL AREA TOTAL ES :" + areaTotal);
        System.out.println("EL VOLUMEN ES:" + volumen);
        lector.close();
    }
}
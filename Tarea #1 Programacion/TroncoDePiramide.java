import java.util.Scanner;

public class TroncoDePiramide {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double areaLateral, volumen, areaTotal;
        double apotema, ladoMenor, ladoMayor, altura, areaBMAYOR, areaBMENOR;
        double pBMAYOR, pBMENOR;

        System.out.println("INGRESE EL LADO MAYOR");
        ladoMayor = lector.nextDouble();

        System.out.println("INGRESE EL LADO MENOR");
        ladoMenor = lector.nextDouble();

        System.out.println("INGRESE LA ALTURA");
        altura = lector.nextDouble();

        // OPERACIONES
        areaBMAYOR = Math.pow(ladoMayor, 2);
        areaBMENOR = Math.pow(ladoMenor, 2);
        apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(ladoMayor, 2));
        pBMAYOR = apotema * ladoMayor;
        pBMENOR = apotema * ladoMenor;
        areaLateral = pBMAYOR + pBMENOR / 2 * apotema;
        areaTotal = areaLateral + areaBMAYOR + areaBMENOR;
        volumen = (1 * altura * (areaBMAYOR + areaBMENOR + Math.sqrt(areaBMAYOR * areaBMENOR)) / 3);

        // RESULTADOS
        System.out.println("EL AREA LATERAL ES DE:" + areaLateral);
        System.out.println("EL AREA TOTAL ES :" + areaTotal);
        System.out.println("EL VOLUMEN ES:" + volumen);
        System.out.println("EL APOTEMA ES:" + apotema);
        System.out.println("EL PERIMETRO BASE MAYOR ES:" + pBMAYOR);
        System.out.println("EL PERIMETRO BASE MENOR" + pBMENOR);
        System.out.println("EL AREA BASE MAYOR ES:" + areaBMAYOR);
        System.out.println("EL AREA BASE MENOR ES: " + areaBMENOR);
        lector.close();
    }
}
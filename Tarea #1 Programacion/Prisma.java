import java.util.Scanner;

public class Prisma {
    public static void main(String args[]) {

        double longitud, altura, pBase, aBase, tang, apotema, areaTotal, areaLateral, volumen;
        int lados;

        Scanner lector = new Scanner(System.in);

        System.out.println("INGRESE LA LONGITUD DEL PRISMA");
        longitud = lector.nextDouble();

        System.out.println("INGRESE EL NUMERO DE LADOS DEL PRISMA");
        lados = lector.nextInt();

        System.out.println("INGRESE LA ALTURA DEL PRISMA");
        altura = lector.nextDouble();

        // CALCULO DE DATOS DE ENTRADA

        pBase = lados * altura;
        tang = 360 / (2 * lados);
        apotema = longitud / (2 * Math.tan(tang * 3.1416 / 180));
        aBase = pBase + apotema / 2;
        volumen = aBase + altura;
        areaLateral = pBase * altura;
        areaTotal = areaLateral + 2 * aBase;

        // RESULTADOS

        System.out.println("El PBASE ES:"+pBase);
        System.out.println(" LA TANGENTE ES:"+tang);
        System.out.println("EL APOTEMA ES:"+apotema);
        System.out.println("EL AREA BASE ES:"+aBase);
        System.out.println("El VOLUMEN ES:"+volumen);
        System.out.println("EL AREA LATERAL ES:"+areaLateral);
        System.out.println("EL AREA TOTAL ES:"+areaTotal);

        lector.close();

    }

}
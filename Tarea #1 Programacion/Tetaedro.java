import java.util.Scanner;

public class Tetaedro {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double area, volumen, altura;
        int aristas;

        System.out.println("INGRESE LAS ARISTAS");
        aristas = lector.nextInt();

        // OPERACIONES

        area = Math.pow(aristas, 2) * Math.sqrt(3);
        volumen = Math.sqrt(2) / 12 * Math.pow(aristas, 3);
        altura = aristas * (Math.sqrt(6) / 3);

        // RESULTADOS

        System.out.println("EL AREA ES:" + area);
        System.out.println("EL VOLUMEN ES :" + volumen);
        System.out.println("LA ALTURA ES :" + altura);
        lector.close();

    }
}
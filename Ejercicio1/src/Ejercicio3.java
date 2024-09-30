import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner lectroTeclado = new Scanner(System.in);

        System.out.println("Cuanto pagaste por el coche");
        int precio_coche = lectroTeclado.nextInt();

        System.out.println("Cuantos plazos se van a pagar");
        int meses = lectroTeclado.nextInt();

        float pago_procientos = (float)precio_coche / meses * (float)0.035;
        float pago = precio_coche /meses + pago_procientos;

        System.out.printf("Vas a pagar el coche de %d€ en %d meses, con un total de %.1f€ cada plazo con " +
                "(3,5 porcientos)",precio_coche,meses,pago);


    }
}

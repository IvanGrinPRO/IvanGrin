import java.util.Scanner;

public class EntradaEjercicioSwitch4 {
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        int mes = lectorTeclado.nextInt();

        switch (mes){

            case 1 | 3 | 5 | 7 | 8 | 10 | 12:
                System.out.println("31 dia");
                break;
            case 2:
                System.out.println("28 o 29 dias");
                break;
            default:
                System.out.println("30 dia");
        }


    }


}

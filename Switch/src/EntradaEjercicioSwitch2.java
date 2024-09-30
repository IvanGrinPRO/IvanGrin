import java.util.Scanner;


public class EntradaEjercicioSwitch2 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        int numero_mes = lectorTeclado.nextInt();


        switch (numero_mes){

            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no es conteplado");
        }

    }

}

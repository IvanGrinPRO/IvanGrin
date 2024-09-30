import java.util.Scanner;

public class ejercicio3 {

    public static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("introduce un pin con 4 digitos");
        int pin = lectorTeclado.nextInt();
        int intentos = 4;


        do {
            System.out.println("introuce el pin");
            int pindeusuario = lectorTeclado.nextInt();
            if (pin != pindeusuario){
                intentos--;
                System.out.printf("El pin introducido no es corecto,te queda %d intentos", intentos);
            } else if (pin == pindeusuario) {
                System.out.println("Muy bien,caja esta abierta");
                break;
            }



        }while (intentos != 0);
        if (intentos == 0){
            System.out.println("Caja esta bloqueada");
        }



    }

}

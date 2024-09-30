import java.util.Scanner;

public class EntradaEjercicioSwitch3 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        char letera_vocal = lectorTeclado.next().charAt(0);
        // variable.toLowerCase  = da llegual si es mayuscula o menuscula

        switch (letera_vocal){

            case 'A' | 'E' | 'I' | 'O' | 'U':
                System.out.printf("la letera %s es vocal",letera_vocal);
                break;
            default:
                System.out.printf("la letra %s es consonante",letera_vocal);


        }


    }

}

import java.util.Scanner;

public class EntradaEjercicioSwitch6_10 {

    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        ejercicio10();
    }

    public static void ejercicio6(){

        System.out.println("1.Patatas fritas");
        System.out.println("2.Coca Cola");
        System.out.println("3.Tortilla patata");
        System.out.println("4.Bocadillo con pollo");

        int numero = lectorTeclado.nextInt();

        switch (numero){
            case 1:
                System.out.println("Has elegido Patatas fritas");
                break;
            case 2:
                System.out.println("Has elegido Coca Cola");
                break;
            case 3:
                System.out.println("Has elegido Tortilla patata");
                break;
            case 4:
                System.out.println("Bocadillo con pollo");
                break;
            default:
                System.out.println("Has elegido numero incorrecto");
                break;
        }

    }

    public static void ejercicio7(){

        System.out.println("Сuánto te gustó la institución del 1 al 5");

        int numero = lectorTeclado.nextInt();

        switch (numero){
            case 1:
                System.out.println("Suspenso");
                break;
            case 2:
                System.out.println("Aprobado");
                break;
            case 3:
                System.out.println("Notable");
                break;
            case 4:
                System.out.println("Sobresaliente");
                break;
            case 5:
                System.out.println("Super");
                break;
            default:
                System.out.println("Ideal");
        }

    }

    public static void ejercicio8(){

        System.out.println("Introduze un numero con quien quieres trabajar");
        int numero1 = lectorTeclado.nextInt();

        System.out.println("Introduze otro numero con quien quieres trabajar");
        int numero2 = lectorTeclado.nextInt();

        System.out.println("Con que simbolo quieres hacer calculo");
        char simbolo = lectorTeclado.next().charAt(0);
        float variable;

        switch (simbolo){

            case '*':
                variable = numero1 * numero2;
                System.out.printf("%d * %d = %.1f", numero1, numero2, variable);
                break;
            case '+':
                variable = numero1 + numero2;
                System.out.printf("%d * %d = %.1f", numero1, numero2, variable);
            case '-':
                variable = numero1 - numero2;
                System.out.printf("%d * %d = %.1f", numero1, numero2, variable);
            case '/':
                variable = (float) numero1/ numero2;
                System.out.printf("%d * %d = %.1f", numero1, numero2, variable);
                break;
            default:
                System.out.println("este símbolo no existe");

        }

    }

    public static void ejercicio9(){


        System.out.println("seleccione el número del mes por el cual le gustaría saber la temporada");
        int numero = lectorTeclado.nextInt();

        switch (numero){

            case 12:
            case 1:
            case 2:
                System.out.println("Este mes es invierno");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Este mes es primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Este mes es verano");
            case 9:
            case 10:
            case 11:
                System.out.println("otono");
                break;


        }
    }

    public static void ejercicio10(){

        System.out.println("1.Iphone 15\n2.PlayStation 5\n3.Nintendo Switch\n4.Samsung S21 FE\n5.Video Tarjeta 4070ti");

        int numero = lectorTeclado.nextInt();

        switch (numero){

            case 1:
                System.out.println("Iphone 15 - 1300 €");
                break;
            case 2:
                System.out.println("PlayStation 5 - 800 €");
                break;
            case 3:
                System.out.println("Nintendo Switch - 350 €");
                break;
            case 4:
                System.out.println("Samsung S21 FE - 400 €");
                break;
            case 5:
                System.out.println("Video Tarjeta 4070ti - 545 €");
                break;
            default:
                System.out.println("Este variable ni existe");
        }

    }

}

import java.util.Scanner;
import java.util.Random;


public class EntradaWhile {

    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        //test2();
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        ejercicio2();


    }

    public static void test1() {

        int i = 10;
        while (i > 0) {

            System.out.printf("El valor de i es %d\n", i);
            i--;

        }
    }

    public static void  test2(){

        int n;

        System.out.println("Introduze un numero de (0 a 10)");
        n = lectorTeclado.nextInt();

        while(n != 0) {
            System.out.println("asdasd");
        }


    }

    public static void ejercicio0(){

        int n;


        do {

            System.out.println("1.Opcion anadir");
            System.out.println("2.Opcion borar");
            System.out.println("3.Opcion listar");
            System.out.println("4.Opcion buscar");
            System.out.println("5.Salir");

            n = lectorTeclado.nextInt();
            switch (n){

                case 1:
                    System.out.println("Ejecutando opcion 1...\n");
                break;

                case 2:
                    System.out.println("Ejecutando opcion 2...\n");
                    break;
                case 3:
                    System.out.println("Ejecutando opcion 3...\n");
                    break;
                case 4:
                    System.out.println("Ejecutando opcion 4...\n");
                    break;
            }
        } while(n != 5);
        System.out.println("Salimos de sistema");

    }

    public static void ejercicio1(){

        int numero;
        int plus = 0;


            do {
                System.out.println("Introduze un numero");
                numero = lectorTeclado.nextInt();
                plus += numero;

            } while(numero != 0);
        System.out.println(plus);

    }

    public static void ejercicio3(){

        int random_number = 0;
        int mayor_numero = 0;

        do {
            random_number = (int)(Math.random() * (100));
            System.out.println(random_number);

            if (random_number > mayor_numero){
                mayor_numero = random_number;
            }

        }while (random_number != 0);
        System.out.printf("Mayor numero era %d",mayor_numero);
    }
    public static void ejercicio4(){

        int numero = 0;

        do {
            System.out.println("Introduze un numero que quieres convertir en binario(no negativo)");
            numero = lectorTeclado.nextInt();

            String binario = Integer.toBinaryString(numero);
            String octal = Integer.toOctalString(numero);
            String hexadeciaml = Integer.toHexString(numero);

            System.out.printf("el numero %d en Binario: %s\nel numero %d en Octal: %s\nel numero %d en Hexadecimal: %s\n"
            , numero, binario, numero, octal, numero, hexadeciaml);

        }while(numero != 0);

    }

    public static void ejercicio5(){

        int random_numer = (int)(Math.random() * (20));
        int number = 0;
        int intentos = 0;

        System.out.println("Introduze un numero de 0 a 20");
        do {
            System.out.println(random_numer);
            number = lectorTeclado.nextInt();
            if (number != random_numer) {
                System.out.println("Lo siento,intentalo de nuevo");
            }
            intentos++;
        }while (number != random_numer);
        System.out.printf("Enhorabuena, has acertado el número en %d intentos",intentos);

    }

    public static void ejercicio6(){

        int random_numer = (int)(Math.random() * (20));
        int number = 0;
        int intentos = 1;
        String sn;

        System.out.println("Introduze un numero de 0 a 20");
        do {
            System.out.println(random_numer);
            number = lectorTeclado.nextInt();
            if (number != random_numer) {
                System.out.println("Lo siento,quieres intentalo de nuevo?");
                sn = lectorTeclado.next().toLowerCase();
                intentos++;
                if (!sn.equals("si")){
                    break;
                }
            }
        }while (number != random_numer);
        System.out.printf("Enhorabuena, has acertado el número en %d intentos",intentos);

    }
    public static void ejercicio2(){

        System.out.println("Escribe primero numero");
        int numero1 = lectorTeclado.nextInt();
        System.out.println("Escribe segundo numero");
        int numero2 = lectorTeclado.nextInt();
        int menor;
        if (numero2>numero1){
            menor = numero1;
        }else {
            menor=numero2;
        }
        boolean finalizacion = false;
        int mayorComun=0;
        do {
            for (int i=1;i<=menor;i++){
                if (numero2 % i == 0 && numero1 % i == 0){
                    mayorComun=i;
                }

                if (i==menor-1){
                    finalizacion=true;
                }
            }
        }while(!finalizacion);
        System.out.println(mayorComun);

    }

}






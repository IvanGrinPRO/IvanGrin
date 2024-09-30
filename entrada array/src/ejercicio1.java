import java.util.Scanner;
import java.util.Random;

public class ejercicio1 {

    public static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        //ejercicio01();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        ejercicio6();

    }
    public static void ejercicio01(){

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = lectorTeclado.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }

    }
    public static void ejercicio2(){

        int[] numeros = new int[30];
        int media = 0;

        for ( int i : numeros) {
            i = (int) (Math.random() * numeros.length+1);
            media += i;
            System.out.println(i);
        }
        System.out.println("Media: " +media/ numeros.length);

    }

    public static void ejercicio3(){

            int [] numeros = new int[10];

            for ( int i = 0 ; i < numeros.length; i++){
                numeros[i] = lectorTeclado.nextInt();
            }

        for (int i = 0; i < numeros.length-1; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = numeros.length-1; i > 0 ; i--) {
            System.out.println(numeros[i]);
        }

    }
    public static void ejercicio4(){


        int [] numeros1 = new int[20];
        int [] numeros2 = new int[20];
        int [] numeros3 = new int[20];

        for (int i = 0; i < numeros1.length; i++) {

            numeros1[i] = (int) (Math.random() * 101);
        }

        for (int i = 0; i < numeros2.length; i++) {

            numeros2[i] = numeros1[i] * numeros1[i];

        }

        for (int i = 0; i < numeros3.length; i++) {

            numeros3[i] = numeros1[i] * numeros1[i] * numeros1[i];

        }
        for (int i = 0; i < numeros1.length; i++) {

            System.out.printf("numero normal %d, numero en cuadrado %d, numero en cubo %d\n", numeros1[i], numeros2[i], numeros3[i]);
        }
    }

    public static void ejercicio5(){

        int [] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = lectorTeclado.nextInt();
        }

        for (int item : numeros){

            if (item % 2 == 0 ){

                System.out.printf("el numero %d es par\n", item);
            } else {

                System.out.printf("el numero %d es inpar\n", item);
            }
        }
    }

    public static void ejercicio6(){

        int [] numeros = new int[20];
        int cambios = 0;

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * 31);

            if (numeros[i] == 6){
                
                numeros[i] = 8;
                cambios++;
                
            } else if (numeros[i] == 7) {
                
                numeros[i] = 11;
                cambios++;
            } else if (numeros[i] == 20) {

                numeros[i] = 10;
                cambios++;
            }
            System.out.println(numeros[i]);
        }
        System.out.println("cambios : " +cambios);

    }

    public static void  ejercicio7(){

        String [] palabras = new String[10];
        int operacion;
        int random_number = 0;
        int todas_leteras = 0;
        int medio_leteras = 0;

        for (int i = 0; i < palabras.length; i++) {

            palabras[i] = lectorTeclado.next();

        }

        do {
            random_number = (int) (Math.random() * palabras.length + 1);

            System.out.println("1.Ver todas las palabras");
            System.out.println("2.Obtener una palabra al azar");
            System.out.println("3.Ver número de letras");
            System.out.println("4.Ver media de letras");
            System.out.println("5.Ver palabra con más letras");
            System.out.println("6.Ver palabra con menos letras");
            System.out.println("7.Salir de sistema");
            operacion = lectorTeclado.nextInt();

            switch (operacion) {
                case 1:
                    for (String item : palabras) {

                        System.out.println(item);
                    }

                case 2:

                    System.out.println(palabras[random_number]);

                case 3:
                    for (String leteras : palabras){

                        todas_leteras = leteras.length();
                        System.out.println("numero de leteras en todas palabras: " +todas_leteras);
                    }

                case 4:

                    medio_leteras = todas_leteras / palabras.length;
            }


        } while ( operacion == 7);

    }

}

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
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        ejercicio12();

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
        int mayuskulas = 0;
        int minuskulas = 0;
        String palabraMasGrande = "";
        String palabramaspequena = "";

        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = lectorTeclado.next();
        }

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > palabraMasGrande.length()){
                palabraMasGrande = palabras[i];
            } else if (palabras[i].length() < palabramaspequena.length()) {
                palabramaspequena = palabras[i];
            }

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
                case 5:
                    System.out.println(palabraMasGrande);

                case 6:
                    System.out.printf(palabramaspequena);

            }

        } while ( operacion == 7);

    }


    public static void ejercicio8(){
        String[] list = new String[10];

        for(int i = 0; i < list.length; i++){
            list[i] = lectorTeclado.next();
        }
        for ( String item : list){
            System.out.println(item);
        }
    }

    public static void ejercicio9(){

        double average_number;
        int total_amount = 0;
        int[] random_numbers = new int[20];


        for (int i = 0; i < random_numbers.length; i++) {
            random_numbers[i] = (int) (Math.random() * 101);
            total_amount += random_numbers[i];
        }

        average_number = total_amount / random_numbers.length;

        System.out.println("medio de todos los numeros: "  +average_number);

    }

    public static void ejercicio10(){

        String[] names = {"Alex", "Guillermo", "Ivan", "Alex", "Alejandro",
                         "Arturo", "Eugenio", "Rubben", "Daniel", "Julia"};

        int random_number = (int) (Math.random() * names.length);

        System.out.println(names[random_number]);

        }

    public static void ejercicio11(){

        int[] list1 = new int[10];
        int[] list2 = new int[10];
        int sumary = 0;


        for (int i = 0; i < list1.length; i++) {

            list1[i] = (int) (Math.random() * 6);
            list2[i] = (int) (Math.random() * 6);


            if (list1[i] == list2[i]){

                sumary++;

            }
        }

       for (int item : list1){

           System.out.printf("%d ", item);
       }

        System.out.println();

       for (int item : list2){

           System.out.printf("%d ", item);

       }

        System.out.println();
        System.out.println("son iguales "+sumary);

    }

    public static void ejercicio12(){


        String[] palabras = {"Leche", "Bocadillo", "CocaCola", "Chocolate", "Patatas",
                            "Protein", "Creatina", "Trenbalone", "Testosteron", "Methan"};

        String biggestword = "";
        int total_leters = 0;
        String shortestword = palabras[0];


        for (String palabra : palabras){

            int length = palabra.length();
            total_leters += length;

            if (length > biggestword.length()){
                biggestword = palabra;
            }

            if (length < shortestword.length()){
                shortestword = palabra;
            }
            System.out.println(total_leters);

        }

        System.out.printf("La palabra mas grande es: %s\nLa palabra mas pequena es: %s\nNumero de todas leteras es: %d",
                biggestword, shortestword, total_leters);

    }

    public static void ejercicio13(){



    }


}


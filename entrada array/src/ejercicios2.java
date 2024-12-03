import java.util.Arrays;
import java.util.Scanner;

public class ejercicios2 {

    public static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
//        ejercicio1();
//        ejercicio2();
        ejercicio3();
    }

    public static void ejercicio1(){

        int[] numeros = new int[5];
        int suma_de_numeros = 0;

        System.out.println("Introduce numeros para meter en lista y multiplicar por 2");
        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("Numero %d:",i+1);
            numeros[i] = lectorTeclado.nextInt();
            numeros[i] = numeros[i] * 2;
            suma_de_numeros = suma_de_numeros + numeros[i];
        }

        System.out.printf("suma de todos los numeros y multiplicados por 2 = %d \n", suma_de_numeros);
        System.out.printf("La media era = %d",suma_de_numeros/numeros.length);
    }

    public static void ejercicio2(){

        System.out.println("Que longitud de array quieres poner? :");
        int longitud_de_array = lectorTeclado.nextInt();
        int[] numeros = new int[longitud_de_array];

        System.out.println("ponte numeros que usted quiere");

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d : ", i);
            numeros[i] = lectorTeclado.nextInt();

        }

        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

        }

    }

    public static void ejercicio3(){

        int longitud = lectorTeclado.nextInt();

        int [] array = new int[longitud];
        int [] array2 = new int[longitud];
        int [] array3 = new int[longitud];

        for (int i = 0; i < longitud; i++) {

            array[i] = (int) (Math.random() * 101);
            array2[i] = (int) (Math.random() * 101);

            array3[i] = array[i] +  array2[i];
            System.out.printf("array1 = %d\narray2 = %d\n\n", array[i], array2[i]);
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);

        }
    }


}
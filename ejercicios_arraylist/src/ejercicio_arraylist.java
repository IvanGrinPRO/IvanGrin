import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class ejercicio_arraylist {

    public static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
//        ejercicio1();
        ejercicio2();

    }

    public static void ejercicio1(){

        ArrayList <Integer> listString = new ArrayList();

        int counter = 1;

        for (int i = 0; i < 10; i++) {

            int numbers = lectorTeclado.nextInt();
            listString.add(numbers);

        }
        for ( int i : listString){

            System.out.printf("%d:%d\n", counter, i);
            counter++;

        }
    }


    public static void ejercicio2(){

//        (int) (Math.random() * 101)
        ArrayList <Integer> listInt = new ArrayList<>();
        float media = 0;

        for (int i = 0; i < 30; i++) {

            int random = (int) (Math.random() * 11);
            listInt.add(random);
            media += random;

        }
        for (int i : listInt){
            System.out.printf("%d, ", i);
        }

        System.out.printf("media nota: %.2f" ,media / 30);

    }

}

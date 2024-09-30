import java.util.Locale;
import java.util.Scanner;

public class Simulacro_t3 {

    public static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
    }

    public static void ejercicio1(){

        int sumapares = 0;
        int numeros = 0;
        float mediadepares = 0f;
        int zerosypares = 0;
        int numerointrdouzidos = 0;
        int sumanopares = 0;
        int numeroparamenu = 0;
        int numerospares = 0;
        int numerosnopares = 0;
        float mediadenopares = 0f;
        int zeros = 0;


        do {

            System.out.println("Introduze numero");
            numerointrdouzidos = lectorTeclado.nextInt();
            if (numerointrdouzidos % 2 ==0){
                sumapares += numerointrdouzidos;
                numerospares++;
            }else if(numerointrdouzidos == 0){
                zeros++;
            } else{
                sumanopares += numerointrdouzidos;
                numerosnopares++;
            }
            numeros++;

        }while (numerointrdouzidos >= 0);

        numeros = numeros -1;

        do {

            System.out.println("1-Suma de los números pares introducidos.");
            System.out.println("2-Media de los números pares introducidos con dos decimales.");
            System.out.println("3-Media de los números impares introducidos con dos decimales.");
            System.out.println("4-Cuántos números hemos introducido.");
            System.out.println("5-Cuantos números de los introducidos han sido ceros, cuántos han sido pares.");
            System.out.println("6-Salir.");

            numeroparamenu = lectorTeclado.nextInt();

            switch (numeroparamenu){

                case 1:
                    System.out.println("Suma de numeros pares: " +sumapares);
                    break;
                case 2:
                    mediadepares = sumapares / (float)numerospares;
                    System.out.printf("Suma de numeros pares: %.2f\n", mediadepares);
                    break;
                case 3:
                    mediadenopares = sumanopares / (float)numerosnopares;
                    break;
                case 4:
                    System.out.println(numeros +"numero hemos introducido");
                    break;
                case 5:
                    System.out.printf("%d zeros\n%d pares\n%d nopares\n", zeros, numerospares, numerosnopares);
                    break;
            }

        }while (numeroparamenu != 6);

    }

    public static void ejercicio2(){

        boolean suspenson = false;
        int notas = 0;
        float medianota = 0f;
        int totalnota = 0;

        for (int i = 1; i <= 20; i++){
            System.out.printf("Notas de alumnos %d :\n",i);
            notas = lectorTeclado.nextInt();
            totalnota += notas;

            if (notas < 5){
                suspenson = true;
            }
        }

        medianota = (float) totalnota / 20;
        if (suspenson){
            System.out.printf("Media nota de 20 alumnos son : %.1f.Hay suspensos!", medianota);
        } else if (suspenson == false) {
            System.out.printf("Media nota de 20 alumnos son : %.1f.No hay suspensos!", medianota);

        }
    }

    public static void ejercicio3(){

        int pin = 0;
        double balance = 0;
        int operacion = 0;
        double numeros = 0;

        do{
            System.out.println("1.Ingresar dinero a cuenta bancaria");
            System.out.println("2.Sacar dinero de cuenta bancaria");
            System.out.println("3.Consulta el estado de la cuenta bancaria");
            System.out.println("4.Salir");

            operacion = lectorTeclado.nextInt();

            switch (operacion){

                case 1:
                    System.out.println("introduce el PIN");
                    pin = lectorTeclado.nextInt();
                    if (pin == 1111){
                        System.out.println("Cuanto dinero quieres ingresar?");
                        numeros = lectorTeclado.nextInt();
                        balance += numeros;
                        numeros -= numeros;
                        System.out.println("Saldo introducido con éxito");
                        break;
                    } else if (pin != 1111) {
                        System.out.println("Pin incorrecto");
                        break;
                    }
                case 2:

                    System.out.println("Introduze el PIN");
                    pin = lectorTeclado.nextInt();
                    if (pin == 1111){
                        System.out.println("Cuanto dinero quieres sacar de la cuenta?");
                        numeros = lectorTeclado.nextInt();
                        if (balance >= numeros){
                            balance -= numeros;
                            numeros -= numeros;
                            System.out.println("saldo introducido con éxito");
                            break;
                        } else {
                            System.out.println("Imposible sacar dinero");
                            break;
                        }
                    }else if (pin != 1111) {
                        System.out.println("PIN incorrecto");
                        break;
                    }
                case 3:
                    System.out.println("Introduze el PIN");
                    pin = lectorTeclado.nextInt();
                    if (pin == 1111) {
                        System.out.printf("Su cuenta bancaria tiene %.2f euros\n", balance);
                        break;
                    }else {
                        System.out.println("PIN incorrecto");
                        break;
                    }
            }

        }while (operacion != 4);
        System.out.println("Adios!");
    }
    public static void ejercicio4(){

        System.out.println("Introduce la palabra(sin acentos)");
        String palabra = lectorTeclado.next();

        String palindromo = "";

        if (palabra.length() < 4){
            palabra= palabra.toUpperCase();
            System.out.println(palabra);
        } else if (palabra.length() > 4 && palabra.length() < 8) {
            palabra = palabra.toLowerCase();
            System.out.println(palabra);
        } else if (palabra.length() > 8 && palabra.length() < 11) {
            palabra = palabra.replace("a","á")
                    .replace("o","ó")
                    .replace("u","ú")
                    .replace("e","é")
                    .replace("i","í");
            System.out.println(palabra);
        } else if (palabra.length() > 11){

            for(int i = palabra.length()-1; i >= 0; i--){
                palindromo += palabra.charAt(i);
            }
            System.out.println(palindromo);
        }


    }

}

import java.util.Scanner;
import java.util.Random;


public class EstructuraFor {

    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio13();
        test();

    }

    public static void ejercicio2() {

        System.out.println("Introduze cual quier numero");
        int numero = lectorTeclado.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", numero, i, (numero * i));
        }

    }

    public static void ejercicio1() {


        System.out.println("Cuantas numeros de temperaturas quieres");
        int numero_temperaturas = lectorTeclado.nextInt();
        float sumatorio = 0;

        if (numero_temperaturas < 0) {
            numero_temperaturas = 10;
        }

        for (int i = 0; i < numero_temperaturas; i++) {
            System.out.printf("%d:Introduze temperatura:", (i + 1));
            int temperatura = lectorTeclado.nextInt();
            sumatorio = sumatorio + temperatura;
        }

        System.out.printf("medida de temperaturas %.1f", (sumatorio / numero_temperaturas));
    }

    public static void ejercicio3() {

        int multiplicacion = 0;

        for (int i = 1; i <= 10; i++) {
            for (int n = 1; n <= 10; n++) {
                multiplicacion = i * n;
                System.out.printf("%d * %d = %d\n", i, n, multiplicacion);
            }

        }

    }

    public static void ejercicio4() {


        System.out.println("introduze primer numero");
        int numero1 = lectorTeclado.nextInt();

        System.out.println("introduze segundo numero");
        int numero2 = lectorTeclado.nextInt();

        for (int i = numero1; i <= numero2; i++) {
            for (int n = 1; n <= 9; n++) {
                int multiplicacion = i * n;
                System.out.printf("%d * %d = %d\n", i, n, multiplicacion);
            }

        }
    }

    public static void ejercicio5() {

        System.out.println("introduze la un numero de base(0 a 5)");
        int base = lectorTeclado.nextInt();

        System.out.println("introduze la un numero de exponente(0 а 5)");
        int exponente = lectorTeclado.nextInt();
        float resultado = 1;

        if (exponente > 0) {

            for (int i = 0; i < exponente; i++) {

                resultado *= base;

            }
        } else if (exponente <= 0 & base <= 0) {
            System.out.println("Error");


        } else if (exponente <= 0) {
            resultado--;
            System.out.println("1");

        }
        System.out.println(resultado);

    }

    public static void ejercicio6() {
        System.out.println("Dame 2 números");

        int number1 = lectorTeclado.nextInt();
        int number2 = lectorTeclado.nextInt();

        for (int i = number1; i <= number2; i++) {
            if (i % 2 == 0) {
                System.out.println("Número par: " + i);
            }
        }
    }
    public static void ejercicio7(){

        int numero_maximo = lectorTeclado.nextInt();

        if (numero_maximo <= 0){
            numero_maximo = 100;
        }

        for (int i = 1; i <= numero_maximo; i++ ) {
            int random_number = 1 + (int)(Math.random() * ((6 - 1) + 1));
            System.out.printf("%d: %d\n", i, random_number);
        }
    }
    public static void ejercicio8(){

        int numerospositivos = 0;
        int numerosdepositivos = 0;

        int numerosnegativos = 0;
        int numerosdenegativos = 0;

        int ceros = 0;
        int numerosdeceros = 0;

        System.out.println("introduze 10 numero(negativos,positivos,ceroc)");

        for (int i = 0; i <= 10; i++){
            int numeros = lectorTeclado.nextInt();
            if (numeros > 0){
                numerospositivos += numeros;
                numerosdepositivos++;

            } else if (numeros < 0) {
                numerosnegativos -= numeros;
                numerosdenegativos++;

            } else if (numeros == 0) {
                numerosdeceros++;

            }
        }
        System.out.println(numerospositivos / numerosdepositivos);
        System.out.println(numerosnegativos / numerosdenegativos);
        System.out.println(numerosdeceros);
    }

    public static void ejercicio9(){

        int masdemill = 0;
        int menosdemil = 0;
        float sueldos = 0f;
        float todas_sueldos = 0;

        System.out.println("Que salario tienes si sumas 10 vezes");
        for (int i = 1; i <= 10; i++) {
            sueldos = lectorTeclado.nextInt();
            todas_sueldos += sueldos;
            if (sueldos >= 1000){
                masdemill++;
            }
            if (sueldos < 1000){
                menosdemil++;
            }

        }
        todas_sueldos = todas_sueldos / 10;
        System.out.printf("El medida de 10 sueldos es %.2f a demas tienes " +
                "%d que era mas de mil y %d menos de mill", todas_sueldos, masdemill, menosdemil);

    }
    public static void ejercicio10(){

        int aprobados = 0;
        int suspensos = 0;

        System.out.println("Introduze 6 notas");
        for (int i = 1; i <= 6; i++){
            int nota = lectorTeclado.nextInt();
            if (nota >= 4){
                aprobados++;

            } else if (nota < 4){
                suspensos++;

            }
        }
        System.out.printf("aprobados: %d y suspenson %d", aprobados, suspensos);

    }

    public static void ejercicio11(){

        System.out.println("introduze base para el cuadrado");
        int base = lectorTeclado.nextInt();

        System.out.println("Introduze altura para el cuadrado");
        int altura = lectorTeclado.nextInt();

        for (int i = altura; i >=0; i-- ){
            for (int n = base; n >=0 ; n--){
                System.out.print("+");
                if (n == 0){
                    System.out.printf("\n");
                }
            }
        }

    }

    public static void ejercicio13(){


        String palabra = lectorTeclado.next();

        for (int i = palabra.length() -1 ; i >= 0; i--){
            char letera = palabra.charAt(i);
            System.out.print(letera);
        }
//        char letera = palabra.charAt(1);

    }

    public static void test(){

        int n = 0;
        while (n<100){
            System.out.println("ЖЕНЯ ЛОХ!");
            n++;
        }
    }

}








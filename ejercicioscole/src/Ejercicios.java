import java.util.Scanner;


public class Ejercicios {

    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {

        ejercicio16test();

    }
    public static void ejercicio1(){

       final String NOMBRE = "Ivan Grinchuk";
       final String CALLE = "C/Maria Martinez";
       final int PORTAL = 9;
       final String LETERA = "A";
       final int CODIGO_POSTAL = 28025;
       final String PAIS = "Espana";
       final int PISO = 3;
       final String CUIDAD = "Madrid";


        System.out.println(NOMBRE);
        System.out.printf("%s n %d,%d%s\n",CALLE,PORTAL,PISO,LETERA);
        System.out.printf("%d %s\n",CODIGO_POSTAL,CUIDAD);
        System.out.println(PAIS);

    }

    public static void ejercicio2(){


        String Nombre; //null
        int Edad;

        System.out.println("ESCRIBE TU NOMBRE COMPLETO: ");
        Nombre = lectorTeclado.nextLine();

        System.out.println("ESCRIBE TU EDAD: ");
        Edad = lectorTeclado.nextInt();

        System.out.printf("Te llamas %s\n",Nombre);
        System.out.printf("Tienes %d anos\n",Edad);
        System.out.println("Pulsa enter para continuar...");


    }

    public static  void ejercicio3(){

        Integer n1;
        Integer n2;

        System.out.println("Primer numero");
        n1 = lectorTeclado.nextInt();

        System.out.println("Segundo numero");
        n2 = lectorTeclado.nextInt();

        int Suma = n1 + n2;
        int Resta = n1 - n2;
        int Multiplicacion = n1 * n2;
        int Divicion = n1 / n2;
        int Resto = n1 % n2;
        float Divicion_real = (float)n1 / (float)n2;
        float Resto_real = (float)n1 - (float)n2;

        System.out.println("Suma: " +Suma);
        System.out.println("Resta: " +Resta);
        System.out.println("Multiplicacion : " +Multiplicacion);
        System.out.println("Divicion: " +Divicion);
        System.out.println("Resto: " +Resto);
        System.out.println("Divicion_real: " +Divicion_real);
        System.out.println("Resto_real: " +Resto_real);

    }

    public static void ejercicio4(){

        int bebida;
        int bocadillos;

        System.out.println("Cuantos bebidas has comprado?");
        bebida = lectorTeclado.nextInt();

        System.out.println("Cuantos bocadillos has comprado?");
        bocadillos = lectorTeclado.nextInt();

        double precio_bebida = 1.25; //float
        double precio_bocadillos = 2.05;

        float coste_bebida = (float) bebida * (float) precio_bebida;
        float coste_bocadillo = (float) bocadillos * (float) precio_bocadillos;

        float total_precio = coste_bebida + coste_bocadillo;

        System.out.println("Numero de bebidas: " +bebida);
        System.out.println("Numero de bocadillos: " +bocadillos);
        System.out.printf("Coste de la bebida: %.2f \n",coste_bebida);
        System.out.printf("Coste de bocadillos: %.2f \n",coste_bocadillo);
        System.out.printf("Coste consumición: %.2f \n",total_precio);

    }

    public static void ejercicio5(){

        int total_segundos = 24973;
        int horas = total_segundos / 3600;
        int segundos = total_segundos % 3600;
        int minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.printf("Numero de segundos: %d\n",total_segundos);
        System.out.printf("Horas: %d\n",horas);
        System.out.printf("Minutos: %d\n",minutos);
        System.out.printf("Segundos: %d",segundos);


    }

    public static void ejercicio6() {

        double valor_compra;
        System.out.println("Valor de la compra(entre 0.00 y 500.00): ");
        valor_compra = lectorTeclado.nextFloat();

        double iva;
        System.out.println("IVA(entre 0 y 25%): ");
        iva = lectorTeclado.nextInt();

        double compra = valor_compra - (valor_compra * iva / 100);
        double iva_resto = valor_compra - compra;

        System.out.printf("Compra: %.2f\n",compra);
        System.out.printf("IVA: %.2f\n",iva_resto);
        System.out.println("======");
        System.out.printf("%.2f",valor_compra);

    }

    public static void ejercicio7(){

        int r;
        System.out.println("Escribe un radio entero: ");
        r = lectorTeclado.nextInt();

        double longitud_circulo = 2 * (Math.PI * r);

        double area_circulo = Math.PI * (r * r);

        System.out.printf("Longitud de la circunferencia: %f\n", longitud_circulo);
        System.out.printf("Area de la circulo: %f\n", area_circulo);

    }

    public static void ejercicio8(){

        double grados;
        double farenheit;
        double kelvins;

        System.out.println("introduse grados centigrados");
        grados = lectorTeclado.nextFloat();

        System.out.println("introduse farenheit");
        farenheit = lectorTeclado.nextFloat();

        System.out.println("introduse kelvins");
        kelvins = lectorTeclado.nextFloat();

        Float c_f = (5*((float)farenheit - 32))/9;
        Float c_k = (float)kelvins - (float)273.15;

        Float f_k = (9*((float)kelvins - (float)273.15))/5 + 32;
        Float f_c = (9 * (float)grados)/5 + 32;

        Float k_c = (float)grados + (float)273.15;
        Float k_f = (5*((float)farenheit - 32))/9 + (float)273.15;

        System.out.printf("Grados centigrados: %.2f\nFarenheit: %.2f Kelvin: %.2f\n", grados, f_c, k_c);
        System.out.printf("Grados Farenheit: %.2f\nCentigrados: %.2f Kelvin: %.2f\n", farenheit,c_f, k_f);
        System.out.printf("Grados Kelvin: %.2f\nCentigrados %.2f Farenheit: %.2f", kelvins, c_k, f_k);

    }


    public static void ejercicio9(){

        int n_bebida;
        int n_bocadillos;

        float p_bebida;
        float p_bocadillos;

        System.out.println("Número de bebidas (entre 0 y 20): ");
        n_bebida = lectorTeclado.nextInt();

        System.out.println("Número de bocadillos (entre 0 y 20): ");
        n_bocadillos = lectorTeclado.nextInt();

        System.out.println("Precio de cada bebida (entre 0,00 y 3,00): ");
        p_bebida = lectorTeclado.nextFloat();

        System.out.println("Precio de cada bocadillo (entre 0,00 y 3,00): ");
        p_bocadillos = lectorTeclado.nextFloat();

        float precio1 =  n_bebida * p_bebida;
        float precio2 = n_bocadillos * p_bocadillos;
        float total_precio = precio1 + precio2;

        System.out.println("ATRIBUTO\t\tCANTIDAD\tPRECIO\t\tCOSTE\n");
        System.out.println("============ =========== ============= ==============");
        System.out.printf("Bebida\t\t\t\t   %d\t\t%.2f\t\t%.2f\n",n_bebida,p_bebida,precio1);
        System.out.printf("Bocadillo\t\t\t\t%d\t\t%.2f\t\t%.2f\n",n_bocadillos,p_bocadillos,precio2);
        System.out.println("                                        ============");
        System.out.println("Precio total:                               "+total_precio);
        System.out.println("________________________________________________________");


    }

    public static void ejercicio10(){

        int decena_mil;
        int unidades_mil;
        int centenas;
        int decenas;
        int unidades;

        System.out.println("Decenas de mil: ");
        decena_mil = lectorTeclado.nextInt();

        System.out.println("Unidades de mil: ");
        unidades_mil = lectorTeclado.nextInt();

        System.out.println("Centenas: ");
        centenas = lectorTeclado.nextInt();

        System.out.println("Decenas: ");
        decenas = lectorTeclado.nextInt();

        System.out.println("Unidades: ");
        unidades = lectorTeclado.nextInt();

        System.out.printf("Numero introducido: %d%d%d%d%d", decena_mil, unidades_mil, centenas, decenas, unidades);

    }

    public static void ejercicio11(){

        int n1;

        System.out.println("Escribe un entero entre 0 y 100: ");
        n1 = lectorTeclado.nextInt();

        boolean espar = (n1 % 2 == 0);
        boolean mas50 = (n1 > 50);

        System.out.printf("Par: %b\nMayor que 50: %b",espar,mas50);

    }

    public static void ejercicio12(){

        System.out.println("Escribe una palabra: ");
        String palabra1 = lectorTeclado.next();

        System.out.println("Escribe una palabra: ");
        String palabra2 = lectorTeclado.next();

        boolean iguales = palabra1.equals(palabra2);
        boolean menorqp2 = palabra1.length()<palabra2.length();
        boolean distintas = !iguales;

        System.out.printf("Son iguales %b\n",iguales);
        System.out.printf("La primera es menor que: %b\n",menorqp2);
        System.out.printf("Son distintas: %b",distintas);

    }
    public static void ejercicio13(){

        System.out.println("a) El primero es par y el segundo impar");
        System.out.println("b) El primero es superior al doble del segundo e inferior a 8");
        System.out.println("c) Son iguales o la diferencia entre el primero y el segundo es menor que 2");

        System.out.println("Escribe un número entre 0 y 9: ");
        int n1 = lectorTeclado.nextInt();

        System.out.println("Escribe un número entre 0 y 9");
        int n2 = lectorTeclado.nextInt();

        boolean condicion1 = (n1 % 2)==0 && !(n2 % 2 == 0);
        boolean condicion2 = (n1 > n2 * 2 && n1 < 8);
        boolean condicion3 = (n1 == n2) || ((n1 - n2) <2);

        System.out.printf("El primero es par y el segundo impar: %b\n",condicion1);
        System.out.printf("El primero es superior al doble del segundo e inferior a 8: %b\n",condicion2);
        System.out.printf("Son iguales o la diferencia entre el primero y el segundo es menor que 2: %b\n", condicion3);

    }

    public static void ejercicio14(){

        System.out.println("Edad:");
        int edad = lectorTeclado.nextInt();

        System.out.println("Nivel de estudios: ");
        int nivel_estudios = lectorTeclado.nextInt();

        System.out.println("Ingresos: ");
        int ingresos = lectorTeclado.nextInt();

        boolean comparacion1 = edad > 40;
        boolean comparacion2 = 5 <= nivel_estudios && nivel_estudios <= 8;
        boolean comparacion3 = ingresos <= 15000;

        boolean comparacion_total = comparacion1 && comparacion2 && comparacion3;

        System.out.printf("Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000: %b",comparacion_total);

    }

    public static void ejercicio15(){

        System.out.println("introduce un numero entero");
        int n = lectorTeclado.nextInt();

        int a = n += 5;
        int b = n -= 3;
        int c = n *= 10;
        int d = n /= 2;

        System.out.println("Incrementar 5 unidades: " +a);
        System.out.println("Decrementar 3 unidades: " +b);
        System.out.println("Multiplicar por 10: " +c);
        System.out.println("Dividir por 2: " +d);

    }

    public static void ejercicio16test(){

        for (int i = 0; i < 20; i++) {
            System.out.println("Sasha y jenia piska");
        }
    }

}

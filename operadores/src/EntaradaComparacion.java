public class EntaradaComparacion {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 10;
        boolean r0 = n1 == n2;
        boolean r1 = n1 != n2;
        boolean r2 = n1 >= n2;
        boolean r3 = n1 >= n3;
        boolean r4 = n1 < n2;

        System.out.println(n1 +" es igual a " +n2 +"? " +r0);
        System.out.println(n1 +" no es " +n2 +"? " +r1);
        System.out.println(n1 +" es mas que " +n2 +"? " +r2);
        System.out.println(n1 +" es mas o igual que " +n3 +"? " +r3);
        System.out.println(n2 +" es mas que " +n1 +"? " +r4);

        int number1 = 30;
        int number2 = 40;
        boolean number3 = true;
        int number4 = -20;
        boolean resultadoLogico = (number1 < number2) && number3 && number4 < 0; // true && true && true = true
        System.out.println("El resultado logico de las && es " +resultadoLogico);
        resultadoLogico = (number1 > 0) || (number2 != number1) || number3 || number4 > 0; // true || true || true || false = true
        System.out.println("El resultado logico de las && es " +resultadoLogico);
        resultadoLogico = (number1 > 0) || (number2 != number1) || number3 || number4 > 0;
        System.out.println("El resultado logico de las && es " +resultadoLogico);
        boolean resultadoCompuesto = ((number1 > number2) && !number3 && (number4 < 10)) || number4 >0 || number2 > 0;
                                   // (F && F && T) || F || T = true

        String palabra1 = "Hola";
        String palabra2 = "hola";
        boolean resultadoPalabras = palabra1.equals(palabra2);

        int m1 = 7;
        int m2 = 3;
        double r = m1/m2; // 2.0

        double m3 = 7;
        int m4 = 3;
        double resultado1 = m3/m4; // 2,5

        int v1 = 4;
        int v2 = 3;
        double resultadoOperacion = (double) v1/v2; //Solo en este ejersicio
        double v1Double = (double) v1; //cambia para siempre
        String v1String = String.valueOf(v1); //Cambiar int  a string
        String palabra = "12345";
        int numeroPalabra = Integer.parseInt(palabra);
        System.out.println(resultadoOperacion);




    }
}

import java.util.Scanner;

public class ejercicio2 {

    public static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {

        int numeroDeCliente = lectorTeclado.nextInt();
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int sumaNumeros = 0;
        boolean positivoDeIgualidad = false;

        for (int i = 1; i <= 10; i++) {
            int random_number = (int) (Math.random() * 100);
            sumaNumeros += random_number;
            System.out.println(i + ": " + random_number);

            if (random_number >= maximo) {
                maximo = random_number;
            }
            if (random_number <= minimo) {
                minimo = random_number;
            }
            if (numeroDeCliente == random_number) {
                positivoDeIgualidad = true;
            }
        }

        if (positivoDeIgualidad) {
            System.out.printf("El numero %d es igual que introduce cliente%n", numeroDeCliente);
        } else {
            System.out.println("El numero de usuario no es igual a los numeros");
        }
        System.out.println("El numero maximo es: " + maximo);
        System.out.println("El numero minimo: " + minimo);
        System.out.println("El medio de todos los numeros es: " + sumaNumeros / 10);
        System.out.println("Suma de todos los numeros: " + sumaNumeros);
    }
}

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("nombre participante");
        String nombre1 = lectorTeclado.next();

        System.out.println("número de jugadores del participante");
        int numero_jugadores1= lectorTeclado.nextInt();


        System.out.println("presupuesto del participante");
        int presupuesto1 = lectorTeclado.nextInt();

        System.out.println("nombre participante");
        String nombre2 = lectorTeclado.next();

        System.out.println("número de jugadores del participante");
        int numero_jugadores2= lectorTeclado.nextInt();

        System.out.println("presupuesto del participante");
        int presupuesto2 = lectorTeclado.nextInt();



        System.out.println("nombre participante");
        String nombre3 = lectorTeclado.next();

        System.out.println("número de jugadores del participante");
        int numero_jugadores3= lectorTeclado.nextInt();

        System.out.println("presupuesto del participante");
        int presupuesto3 = lectorTeclado.nextInt();


        boolean requisito1 = (numero_jugadores1>=11);
        boolean requisito_de_11_jugadores = (numero_jugadores1>=11) && (numero_jugadores2>=11) &&
                                                                (numero_jugadores3>=11);

        boolean requisito2 = (numero_jugadores2%2 == 0);

        boolean requisito3 = (presupuesto3>0);
        boolean requisito_prep_positivo = (presupuesto1>0) && (presupuesto2>0) && (presupuesto3>0);

        boolean la_liga = requisito_de_11_jugadores && requisito_prep_positivo;

        System.out.printf("1. El primer participante tiene 11 jugadores: %b\n",requisito1);
        System.out.printf("2. El segundo participante tiene jugadores pares: %b\n",requisito2);
        System.out.printf("3. El tercer participante tiene presupuesto positivo: %b\n",requisito3);
        System.out.printf("4.  La liga está preparada para empezar: %b",la_liga);
    }


}

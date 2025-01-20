import java.util.Scanner;
import Controll.Humano;

import java.util.ArrayList;

public class Entrada {

    public static Scanner lectorTeclado = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Humano> humanos = new ArrayList<>();


        Humano humano = new Humano("Eugenio","Pendiur","Y0293948H",17,82,187);
        humano.mostrarDatos();

        System.out.println("Nombre :");
        String n = lectorTeclado.next();
        System.out.println("Apellido :");
        String a = lectorTeclado.next();
        System.out.println("DNI: ");
        String d = lectorTeclado.next();
        System.out.println("Edad :");
        int e = lectorTeclado.nextInt();
        System.out.println("Peso :");
        double p = lectorTeclado.nextDouble();
        System.out.println("Altura :");
        double al = lectorTeclado.nextDouble();


        Humano humano1 = new Humano(n,a,d,e,p,al);
        humano1.mostrarDatos();


    }
}

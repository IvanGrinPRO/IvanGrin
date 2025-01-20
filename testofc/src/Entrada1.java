import model.Coche;

public class Entrada1 {
    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.mostrarDatos();

        System.out.println();

        Coche coche2 = new Coche("Ford","Focus","gris");
        coche2.mostrarDatos();

        System.out.println();

        Coche coche3 = new Coche("Opel", "Corsa", 250);
        coche3.mostrarDatos();
    }
}

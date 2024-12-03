public class Entrada {

    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        System.out.println("Bienvenido a la app de gestion de coches");
        garaje.anadirCoche("Mercedes","c220",200,"1234A");
        garaje.anadirCoche("Ford","fiesta",150,"1234f");
        garaje.anadirCoche("Ford","fiesta",150,"1234fd");
        garaje.mostrarCoches();
    }
}
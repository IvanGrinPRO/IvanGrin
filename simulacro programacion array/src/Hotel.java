import java.util.ArrayList;
import java.util.Scanner;


public class Hotel {

    private ArrayList<Object[]>informacion = new ArrayList<>();
    public Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {

    }


    public void menu(int opcion){

        System.out.println("Buenas dias!");

        do {

            System.out.println("1.Hacer reserva");
            System.out.println("2.Cancelar reserva");
            System.out.println("3.Mostrar reservas actuales");
            System.out.println("4.Mostrar reservas ordeandas");
            System.out.println("5.Salir de sistema");

            switch (opcion){
                case 1:
                    System.out.println("Introduce numero de habitacion que prefieres");
                    int numero_habitacion = lectorTeclado.nextInt();
                    System.out.println("Su nombre");
                    String nombre = lectorTeclado.next();
                    System.out.println("Su numero de telefono");
                    int numero_telefono = lectorTeclado.nextInt();
                    System.out.println("ID:");
                    int id = lectorTeclado.nextInt();
                    System.out.println("Cuantos clientes en total");
                    int numero_clientes = lectorTeclado.nextInt();

                    reserva(numero_habitacion,nombre,numero_telefono,id,numero_clientes);
                    break;
                case 2:
                    System.out.println("Para cancelar reserva nececitas introducir su ID");
                    cancelar_reserva(lectorTeclado.nextInt());
                case 3:



            }


        }while (opcion != 5);


    }
    public void reserva(int Numero_habitacon, String Nombre, int Numero_telefono, int ID, int Numero_clientes){
    Object[] habitacion = {Numero_habitacon, Nombre, Numero_telefono, ID, Numero_clientes};
    informacion.add(habitacion);

    }

    public void cancelar_reserva(int id2){

        for (Object[] item : informacion ){
            if (Integer.valueOf(item[3].toString()) == id2){
                informacion.remove(item);
                break;
            }
        }
    }

    public void mostrar_reservas_actuales(int numero_habitacion, int id){



    }
}
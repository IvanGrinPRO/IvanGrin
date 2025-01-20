import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {



        ArrayList<Coche> listaCoche = new ArrayList<>();
        ArrayList<Carrera> listaparticipante = new ArrayList<>();
//        listaCoche.add(new Coche("Ford", "Focus", 400,5));
//        listaCoche.add(new Coche("Seat","Ibiza", 300,2));
//        listaCoche.add(new Coche("Mercedes", "C300",400,4));
//        Carrera participante = new Carrera(5, "sdfasd");

        int opcion = 0;
        int opcion2 = 0;
        do {

            System.out.println("1.Anadir coche");
            System.out.println("2.Mostrar top de coches");
            opcion = lectorTeclado.nextInt();

            if (opcion == 1){

                int random_km  = (int) (Math.random() * 25)+50;

                System.out.println("Marca de coche");
                String marca_coche = lectorTeclado.next();

                System.out.println("Modelo de coche");
                String modelo_coche = lectorTeclado.next();

                System.out.println("Cuantos cv tiene coche");
                int cv_coche = lectorTeclado.nextInt();

                System.out.println("Vueltas");
                int cuantas_coche = lectorTeclado.nextInt();

                listaCoche.add(new Coche(marca_coche,modelo_coche,cv_coche,cuantas_coche * random_km));
            }

        }while(opcion!=2);

        listaCoche.sort(((o1, o2) -> Integer.compare(o2.getCv(), o1.getCv())));


        for (int i = 0; i < listaCoche.size(); i++) {

            System.out.printf("TOP:%d\nMarca : %s\nModelo : %s\nCv : %d\nCuanto kilometros : %d\n"
                    ,i+1 ,listaCoche.get(i).getMarca() ,listaCoche.get(i).getModelo() ,listaCoche.get(i).getCv() , listaCoche.get(i).getCuantas());

        }

//        do {
//
//            System.out.println("1.inscribir un participante");
//            System.out.println("2.Desinscribir un participante");
//            System.out.println("3.Mostrar todos participantes");
//            System.out.println("4.Iniciar carrera");
//
//
//
//        }while (opcion !=4);
        listaparticipante.add(new Carrera(4,"asd"));
        listaparticipante.add(new Carrera(4,"asd"));
        listaparticipante.add(new Carrera(4,"asd"));
        listaparticipante.add(new Carrera(4,"asd"));
        listaparticipante.add(new Carrera(4,"asd"));
        listaparticipante.add(new Carrera(4,"asd"));
        listaparticipante.add(new Carrera(4,"asd"));
        listaparticipante.add(new Carrera(4,"asd"));



    }
}

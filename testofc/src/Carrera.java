import model.Coche;

import java.util.ArrayList;
import java.util.Comparator;

public class Carrera {

    public static void main(String[] args) {

        ArrayList<Coche> listaCoche = new ArrayList<>();
        listaCoche.add(new Coche("Ford", "Focus", 400,5));
        listaCoche.add(new Coche("Seat","Ibiza", 300,2));
        listaCoche.add(new Coche("Mercedes", "C300",400,4));

        listaCoche.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                return 1;
            }
        });
        for(Coche coches : listaCoche){
            System.out.printf("Marca: %s\nModel: %s\n Cv: %d\nCuantas vueltas: %s", coches[1]);

        }


    }
}

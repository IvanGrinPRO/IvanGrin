import java.util.ArrayList;

public class Garaje {

    private ArrayList<Object[]> listaCoches = new ArrayList<>();
//    boolean anadirmascoches = true;



    public void anadirCoche(String marca, String modelo, int cv, String matricula) {
        if (listaCoches.size() <= 5) {
            Object[] coche = new Object[]{marca, modelo, cv, matricula};
            listaCoches.add(coche);

            for ( Object[] item : listaCoches){
                if (item[3].equals(matricula)){
                        System.out.println("Coche ya existe con la misma matricula" + matricula);
                        return;
                }
            }

        }
    }

    public void mostrarCoches() {

            for (Object[] coche : listaCoches) {
                System.out.println(coche[3] + " - " + coche[0] + " - " + coche[1]);


        }
        for ( Object[] item : listaCoches){
            if (item[3].equals(matricula)){
                System.out.println("Coche ya existe con la misma matricula" + matricula);
                return;
            }
        }
    }
}
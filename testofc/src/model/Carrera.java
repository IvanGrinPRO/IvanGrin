package model;

import java.util.ArrayList;

public class Carrera {

    private String nombre;

    private int vueltas;

    private Coche ganador;

    private ArrayList<Coche> participantes;

    public Carrera(){
        nombre = "Sin defenir";

    }

    public Carrera(int vueltas, String nombre){

        this.vueltas = vueltas;
        this.nombre = nombre;
        participantes = new ArrayList<>();
    }


    public void MostrarDatosParticipante(){
        System.out.println("Nombre de participante" +this.nombre);
        System.out.println("Vueltas de participante" +this.vueltas);

    }

    public void Verificador(Coche coche){

        if (participantes.size() <= 8 || coche.getCv() >= 300 ){

            System.out.println("Perdona no se puede inscribir");
        }else {
            participantes.add(coche);
            System.out.println("Agregado con exito");
        }

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public ArrayList<Coche> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Coche> participantes) {
        this.participantes = participantes;
    }
}

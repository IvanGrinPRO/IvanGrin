package model;

import java.util.ArrayList;

public class Garaje {

    private Coche coche;
    private String averia_ascociada;
    private int coches_atendiendo;
    private boolean disponibilidad = false;

    ArrayList<Coche>coches = new ArrayList<>();

    public void aceptarCochec(Coche coche, String averia_ascociada){

        if(this.disponibilidad = false){

            this.coche = coche;
            this.averia_ascociada = averia_ascociada;
            this.disponibilidad = true;

        }
    }

    public boolean devolverCoche(){

        return this.disponibilidad = false;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getAveria_ascociada() {
        return averia_ascociada;
    }

    public void setAveria_ascociada(String averia_ascociada) {
        this.averia_ascociada = averia_ascociada;
    }

    public int getCoches_atendiendo() {
        return coches_atendiendo;
    }

    public void setCoches_atendiendo(int coches_atendiendo) {
        this.coches_atendiendo = coches_atendiendo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }
}

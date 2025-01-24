package model;

public class Asignatura {

    private int id;
    private double calificacion;

    public Asignatura() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Asignatura(int identificador){
        this.id = identificador;
    }
}

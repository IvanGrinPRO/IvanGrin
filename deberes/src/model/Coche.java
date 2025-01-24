package model;

public class Coche {

    private Motor motor;
    private String marca;
    private double averias;


    public Coche(){}

    public Coche(String marca, double averias){
        this.marca = marca;
        this.averias = averias;
    }

    public double getAverias() {
        return averias;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setAverias(double averias) {
        this.averias = averias;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void acumularAveria(double costo){

        this.averias += costo;
    }
}


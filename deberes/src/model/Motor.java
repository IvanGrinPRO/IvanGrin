package model;

public class Motor {

    private int litros_aceite;
    private int cv;

    public Motor(){}

    public  Motor(int cv){

        this.cv = cv;
        this.litros_aceite = 0;
    }

    public int getLitros_aceite() {
        return litros_aceite;
    }

    public void setLitros_aceite(int litros_aceite) {
        this.litros_aceite = litros_aceite;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}

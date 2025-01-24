package Controll;

public class Humano {
    private String nombre,Apellido,dni;
    private int edad;
    private double peso,altura;


    public Humano(){
        this.nombre = "sin defenir";
        this.Apellido = "sin defenir";
        this.dni = "sin defenir";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
    }

    public Humano(String nombre,String Apellido, String dni,int edad,double peso,double altura){

        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;

    }

    public void mostrarDatos(){
        System.out.println("El nombre de persona es " + this.nombre);
        System.out.println("El apellido de persona es " + this.Apellido);
        System.out.println("DNI de persona era " + this.dni);
        System.out.println("Edad de persona es " +this.edad);
        System.out.println("Peso de persona es " + this.peso);
        System.out.println("La altura de persona es " + this.altura);

    }

    public Humano (String nombre,String Apellido){

        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = "11111111X";
        // peso altura ...
    }

    public double Imc(){

        double imc  = peso/Math.pow(altura,2);
        return imc;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

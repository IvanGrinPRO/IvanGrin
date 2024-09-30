public class Entrada {

    static int edadClase = 50;
    // mod_acc mod_adional mor_ret nombre (argumentos) { cuerpo }
    public static void main (String[] args) {

        System.out.println("proyecto de variables");
        //Tipo nombre = valor (el valor es opcional)
        String nombre = "Ivan";
        final String CIF = "B12345"; //constante siempre en mayuscula

        char letra = 'A';
        Character letraCompleja = 'a';

        short numeroPequenio = 23; // numero (-255, 255)
        Short pequienaCompletja = 123;


        int edad = 18; //numeros sin decimal (-65,435, 65.435)
        Integer edadCompleja = 18;

        System.out.println("Mi edad es"+edad);
        edad = 19;
        System.out.println("Cambiando edad");
        System.out.println("Mi edad es"+edad);
        long telefono = 123456789;
        Long telefonoCompleto = 123123123L ;

        float altura = 3.14f;
        Float alturaCompejo;

        double decimalesDetalle = 3.1415163456;
        Double decamlesDetallecomplejo;

        boolean carne = true; //false
        Boolean carneComplejo;
    }
    public static void  miMetodo(){
        String nombre = "Julia";
        int edad = 18;
    }
    public static void otroMetodo(){
        int edadClase = 70;
        System.out.println(edadClase);
        //System.out.println(this.edadClase);

    }
}
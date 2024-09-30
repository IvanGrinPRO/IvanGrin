import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("introduce su Nombre");
        String Nombre = lectorTeclado.next();

        System.out.println("introduce su Apedido");
        String Apedido = lectorTeclado.next();

        System.out.println("introduce su edad");
        int Edad = lectorTeclado.nextInt();

        System.out.println("introduce su altura");
        int Altura = lectorTeclado.nextInt();

        System.out.println("introduce su peso");
        float Peso = lectorTeclado.nextFloat();

        System.out.println("introduce su sexo (M/F");
        char Sexo = lectorTeclado.next().charAt(0);

        float IMC = CalculationIMC(Peso,Altura);
        System.out.printf("Hola %s tu IMC teniendo en cuenta tu altura %dcm y tu peso de %.1f,tiene un valor de %.2f"
                ,Nombre,Altura,Peso,IMC);


    }
    public static float CalculationIMC(float kg,float m){

        return kg /(m * m); // Math.pow(m,2)

    }
}

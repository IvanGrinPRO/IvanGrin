import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);


        System.out.println("Altura Tringulo");
        float altura = lectorTeclado.nextInt();

        System.out.println("Base Triangulo");
        float base = lectorTeclado.nextInt();

        System.out.println("escribe 3 lados de triangulo");
        int lado1 = lectorTeclado.nextInt();
        int lado2 = lectorTeclado.nextInt();
        int lado3 = lectorTeclado.nextInt();

        double area = calculosAreaTriangulo(altura,base);

        boolean trianguloisosteles = lado1 == lado2 || lado1 == lado3 || lado2 == lado3;

        boolean trianguloequilatero = lado1 == lado2 && lado1 == lado3 && lado2 == lado3;

        System.out.printf("El área del triángulo con base %.1f y altura %.1f es %.1f\n",base,altura,area);
        System.out.printf("El triángulo es isósceles %b\n",trianguloisosteles);
        System.out.printf("El triángulo es equilátero %b\n", trianguloequilatero);


        System.out.println("Introduce un radio de circuito");
        float radio = lectorTeclado.nextFloat();

        double areacirculo = calculoAreaCircuito(radio);

        System.out.printf("Area del circulo es %.3f",areacirculo);
        
    }

    public static double calculosAreaTriangulo (float base, float altura){

        return (base * altura) * 2;
    }

    public static double calculoAreaCircuito(float radio){

        return Math.PI * Math.pow(radio,2);

    }

}

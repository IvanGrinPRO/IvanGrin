import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        String s = null;
        int a = lectorTeclado.nextInt();

        if (a%2==0){
            s = "Es par";
        }
        System.out.println(s);
    }
}

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        int a = lectorTeclado.nextInt();

        if (a%2==0){
            a++;
        } else if (a<10) {
            a--;
        } else if (a<100) {
            a*=2;
            a++;
        } else {
            a = 0;
        }

        System.out.println(a);
    }

}

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        int a = lectorTeclado.nextInt();

        if (a<0) {
            System.out.println("negativo");
        } else if (a<10) {
            System.out.println("un digito");
        } else if (a<99) {
            System.out.println("dos digitos");
        } else{
            System.out.println("tres digitos");
        }
    }

}

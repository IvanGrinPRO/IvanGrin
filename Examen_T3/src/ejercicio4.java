import java.util.Scanner;

public class ejercicio4 {

    public static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {

        boolean finalizarBase = false;
        do {
            System.out.println("Introduce el numero:");
            int numero = lectorTeclado.nextInt();
            String resultado = "";


            if (numero <=0){
                System.out.println("El numero es negativo,no se puede hacer calculo");
            } else {
                System.out.println("1.Base2\n2.Base8\n3.Base16\n4.Salir");
                int menu = lectorTeclado.nextInt();
                boolean terminar = false;
                switch (menu){
                    case 1:
                        do {
                            if (numero%2==0){
                                resultado = "0" + resultado;
                                numero = numero/2;
                            } else {
                                resultado = "1" + resultado;
                                numero = numero/2;
                            }
                            if (numero<=1){
                                resultado = "1" +resultado;
                                terminar = true;
                            }
                        } while (!terminar);
                        System.out.println(resultado);
                        break;
                    case 2:
                        do {
                            if (numero%8==0){
                                resultado = "0" + resultado;
                                numero = numero/8;
                            } else {
                                resultado = "1" + resultado;
                                numero = numero/8;
                            }
                            if (numero<=8){
                                resultado ="1" + resultado;
                                terminar = true;
                            }
                        } while (!terminar);
                        System.out.println(resultado);
                        break;
                    case 3:
                        do {
                            if (numero%16==0){
                                resultado = "0" + resultado;
                                numero = numero/16;
                            } else {
                                resultado = "1" +resultado;
                                numero = numero/16;
                            }
                            if (numero<=16){
                                resultado ="1" +resultado;
                                terminar =true;
                            }
                        } while (!terminar);
                        System.out.println(resultado);
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        finalizarBase=true;
                        break;
                }
            }
        } while(!finalizarBase);

    }

}
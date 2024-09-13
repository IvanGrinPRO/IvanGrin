public class Entrada {

    public static void main(String[] args) {
        //Operadores aritmeticos - binarios
        float operador1 = 10;
        int operador2 = 5;
        float resultado = operador1 + operador2; // 15
        System.out.println("El resultado de la suma es " +resultado);

        resultado = operador1 - operador2; // 5
        System.out.println("El resultado de la resta es " +resultado);

        resultado = operador1*operador2;
        System.out.println("El resultado de multiplicacion es " +resultado);

        operador1 = 7;
        operador2 = 4;
        resultado = operador1/operador2; //2
        System.out.println("El resultado de division es " +resultado);

        resultado = operador1%operador2; //2
        System.out.println("El resultado de resto es " +resultado);
        //Aritmeticos monarios
        resultado = -resultado;
        System.out.println("El resultado de opuesto es " +resultado);
        //resultado = resultado +1  NO
        resultado ++; // mas 1
        System.out.println("El resultado de incremento es " +resultado);
        resultado --;
        System.out.println("El resultado de decremento es " +resultado);
        operador1 = 10;
        //resultado = 1
        resultado += operador1;
        System.out.println("El resultado de la suma asignada es " +resultado);
        resultado -=6;
        System.out.println("El resultado de la resta asignada es " +resultado);
        resultado *= 3;
        System.out.println("El resultado de la multiplicacion asignado es " +resultado);
        resultado /= 2;
        System.out.println("El resultado de la divicion asignado es " +resultado);
        resultado %= 2;
        System.out.println("El resultado del modulo asignado es " +resultado);




    }
}

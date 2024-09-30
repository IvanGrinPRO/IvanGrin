public class Ejercicio4 {

    public static void main(String[] args) {


        double purchase = 30000.0;
        double monthlyReduction = 5000.0;
        double interestRate = 3.5;

        double interestAmount1 = purchase * (interestRate / 100.0);
        System.out.printf("El interes pagado (%.1f) en el primer mes es de %.0f %.1f de %.1f\n"
                ,interestRate, interestAmount1,interestRate,purchase);
        purchase -= monthlyReduction;
        interestRate += 3.5;

        double interestAmount2 = purchase * (interestRate / 100.0);
        System.out.printf("El interes pagado (%.1f) en el segundo mes es de %.0f %.1f de %.1f\n"
                ,interestRate, interestAmount2,interestRate,purchase);
        purchase -= monthlyReduction;
        interestRate += 3.5;

        double interestAmount3 = purchase * (interestRate / 100.0);
        System.out.printf("El interes pagado (%.1f) en el tercer mes es de %.0f %.1f de %.1f\n"
                ,interestRate, interestAmount3,interestRate,purchase);
        purchase -= monthlyReduction;
        interestRate += 3.5;

        double interestAmount4 = purchase * (interestRate / 100.0);
        System.out.printf("El interes pagado (%.1f) en el cuarto mes es de %.0f %.1f de %.1f\n"
                ,interestRate, interestAmount4,interestRate,purchase);
        purchase -= monthlyReduction;
        interestRate += 3.5;

        double interestAmount5 = purchase * (interestRate / 100.0);
        System.out.printf("El interes pagado (%.1f) en el quinto mes es de %.0f %.1f de %.1f\n"
                ,interestRate, interestAmount5,interestRate,purchase);
        purchase -= monthlyReduction;
        interestRate += 3.5;

        double interestAmount6 = purchase * (interestRate / 100.0);
        System.out.printf("El interes pagado (%.1f) en el sexto mes es de %.0f %.1f de %.1f"
                ,interestRate, interestAmount6,interestRate,purchase);





    }

}

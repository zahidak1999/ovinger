import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /* WHILE-løkke, fortsetter programmet etter å ha fått inn resultat */
        while(true){

            System.out.println("Skriv inn teller, så nevner for første brøk.");
            double numerator = scanner.nextDouble();
            double denominator = scanner.nextDouble();
            Fraction frac1 = new Fraction(numerator, denominator);

            System.out.println("Skriv inn teller, så nevner for andre brøken.");
            double numerator2 = scanner.nextDouble();
            double denominator2 = scanner.nextDouble();
            Fraction frac2 = new Fraction(numerator2, denominator2);

            /* Valg av metode */
            System.out.println("Velg hvilken metode mellom addisjon(1), subtraksjon(2), divisjon(3), og multiplikasjon(4)");
            int choice = scanner.nextInt();

            /* bruker switch og case for hver regneart */
            switch(choice) {
                case 1:

                    if(choice == 1) {

                        frac1.add(frac2);
                        System.out.println(frac1.getNumerator() + " / " + frac1.getDenominator());
                }

                case 2:

                    if(choice == 2){
                    
                        frac1.subtract(frac2);
                        System.out.println(frac1.getNumerator() + "/" + frac1.getDenominator());
                        System.out.println("Scott er gay");
                }
                case 3:
                    
                    if(choice== 3){
                    
                        frac1.multiply(frac2);
                        System.out.println(frac1.getNumerator() + "/" + frac1.getDenominator());
                        System.out.println("Scott er gay");
                }
                case 4:
                    if(choice == 4) {

                        frac1.divide(frac2);
                        System.out.println(frac1.getNumerator() + "/" + frac1.getDenominator());
                }
            }
        }
    }
}


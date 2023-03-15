import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person("Scott", "Emonanekkul", 2008);
        Employee employee = new Employee(person, 27, "01.01.2001", 45000, 45);

        do {
            System.out.println("----Arbeidstaker----");
            System.out.println(employee.getName() + ". Arbeidstaker nummer: " + employee.employeeNumber + ".");
            System.out.println("Tast 1 for mer informasjon om arbeidstaker.");
            System.out.println("Tast 2 for endring av informasjon til arbeidstaker.");

            int menyInput = scanner.nextInt();
            
            if(menyInput == 1) {
                System.out.println("Arbeidstaker nummer: " + employee.employeeNumber);
                System.out.println("Får utbetalt " + employee.monthlySalary + " kr nettolønn i måneden.");
                System.out.println("Årlig: " + employee.YearlySalary() + " kr.");
                System.out.println("Skatteprosent på: " + employee.taxRate + "%.");
                System.out.println("Betaler årlig skatt: " + employee.TaxesYearly() + " kr.");
                System.out.println("Ansatt dato: " + employee.employedDate);
                System.out.println("Alder: " + employee.Age());

            } else if(menyInput == 2) {
                System.out.println("Tast inn 1 for ny månedslønn.");
                System.out.println("Tast inn 2 for ny skatteprosent.");

                int menyInput2 = scanner.nextInt();
                if (menyInput2 == 1) {
                    System.out.println("Tast inn ny månedslønn: ");
                    employee.setMonthlySalary(scanner.nextDouble());
                    
                } else if(menyInput2 == 2) {
                    System.out.println("Tast inn ny skatt:");
                    employee.setTaxRate(scanner.nextDouble());
                    
                }
            }
        }while(true);
    }
}
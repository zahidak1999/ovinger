import java.util.Scanner;

public class NewStringClient {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            
            System.out.println("Skriv inn tekst");
            String input = scanner.nextLine();
            NewString a = new NewString (input);

            System.out.println("tast 1 for å forkorte teksten.");
            System.out.println("Tast 2 for fjerning av bokstav i tekst.");
            
            int menyInput = scanner.nextInt();
            switch (menyInput) {
                case 1: System.out.println(a.abbreviate());
                        break;
                case 2: System.out.println("Skriv inn bokstav du vil fjerne.");
                        char letter = scanner.next().charAt(0);
                        scanner.nextLine();
                        System.out.println(a.remove(letter));
                        break;

            }
        }
    }
}

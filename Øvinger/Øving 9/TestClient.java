import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) {

        TaskOverview overview = new TaskOverview();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try{

            System.out.println("Tast 1 for å sjekke alle studenter.");
            System.out.println("Tast 2 for antall oppgaver en student har gjort.");
            System.out.println("Tast 3 for å øke antall oppgaver for en student.");
            System.out.println("Tast 4 for å registrere en ny student.");
            int choice = scanner.nextInt();
            scanner.nextLine();

                switch (choice) {
                    case 1:

                        if(overview.getAllStudents() < 1) {
                            System.out.println("Ingen studenter å vise, registrer noen.");

                        } else if (overview.getAllStudents() >= 1){
                            System.out.println(overview.toString());
                            System.out.println("Antall studenter: " + overview.getAllStudents());
                        }
                    break;
                    
                    case 2:
                        System.out.println("Skriv inn student:");
                        String name = scanner.nextLine();
                        System.out.println(overview.getTasksStudent(name));
                    break;
                    
                    case 3:
                        System.out.println("Hvilken student?");
                        String name2 = scanner.nextLine();
                        System.out.println("Hvor mange oppgaver?");
                        int increase = scanner.nextInt();
                        overview.setTasksStudent(name2, increase);
                    break;

                    case 4:
                            System.out.println("Skriv inn ny navn til student:");
                            String name3 = scanner.nextLine();
                            System.out.println("Skriv inn antall oppgaver de har løst:");
                            int numberOfTasks = scanner.nextInt();
                            overview.newStudent(name3, numberOfTasks);
                    break;
                }
            } 
            catch (Exception e) {
                System.out.println("Ikke gjør noe dumt, følg instruksene." + e);
            }
        }
    }
}
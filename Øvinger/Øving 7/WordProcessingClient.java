import java.util.Scanner;

public class WordProcessingClient {
    public static void main(String [] args) {

        Scanner scanner = new Scanner (System.in);


        while(true) {

            System.out.println("Skriv inn tekst:");
            String input = scanner.nextLine();
            WordProcessing a = new WordProcessing (input);

            System.out.println("Tast 1 for teksten du nettop skrev inn.");
            System.out.println("Tast 2 for store bokstaver!");
            System.out.println("Tast 3 for å bytte ut ord.");
            System.out.println("Tast 4 for antall ord i teksten.");
            System.out.println("Tast 5 for gjennomsnittlig ordlengde.");
            System.out.println("Tast 6 for gjennomsnittlig ord i hver setning.");

            int menyInput = scanner.nextInt();
            switch(menyInput) {
                case 1: System.out.println(a.wholeText());
                    break;
                case 2: System.out.println(a.wideText());
                    break;
                case 3: System.out.println("Skriv inn hvilket ord du vil bytte ut.");
                        String textWord = scanner.next();
                        System.out.println("Skriv ordet du vil bytte med");
                        String replace = scanner.next();
                        System.out.println(a.replaceWord(textWord, replace));
                    break;
                case 4: System.out.println(a.wordCounter());
                    break;
                case 5: System.out.println(a.averageWordLength());
                    break;
                case 6: System.out.println(a.averageWordsPerSentence());
                    break;
            }
            scanner.nextLine();
        }
    }
}

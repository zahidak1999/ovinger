import java.util.Scanner;

public class Oppgave1 {
	public static void main(String[] args) {

        //Kode for å skrive inn tall selv
        System.out.println("Skriv inn tall 1");
        try (Scanner scanner = new Scanner (System.in)) {
            int tall = scanner.nextInt();

            System.out.println("Skriv inn tall 2 (må være høyere enn første tallet)");
            int tall2 = scanner.nextInt();
            
            //for-loop for tittelen
            for (int t = tall; t <= tall2; t++) {
                System.out.println(t +"-gangen");

                //Blir en for-loop inne i en for-loop for å ta for seg gangetabellen
                for (int i = 1; i<11; i++){

                    //Printer ut tallene i siste meldingen
                    System.out.println(t +" x "+ i +" = "+ t*i); 
                }   
            }
        }    
    }
}
import java.util.Scanner;

public class ValutaKlient {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        /* Definerer de forskjellige valuta-kursen for programmet */
        Valuta dollar = new Valuta(10.26);
        Valuta euro = new Valuta (10.23);
        Valuta svenskKrona = new Valuta(0.95);

        /* WHILE-løkke for å la programmet sirkulere på seg selv */
        while(true){

            /* Starten av koden. gir instrukser til brukeren for å fortsette programmet.
             * Den vil loope seg selv etter at brukeren har fått mengden og resultatet de er ute etter.
             */
            System.out.println("Velkommen til valutakalkulater! Tast 1 for Dollar, 2 for Euro, eller 3 for svenske krona. Tast 4 for Avslutt");

            int valg = scanner.nextInt();

            /* Break først, for å avslutte programmet, ved valg av brukeren. 
             * Setter det først slik at den avslutter løkken tidlig 
             */
            if(valg == 4){
                break;
            }

            /* SWITCH slik at programmet kan differensiere de forskjellige valgene brukeren tar. */
            switch(valg){

                /*CASE 1 utgjør dollar. Bruker IF-setning for å differensiere mellom tilNOK og fraNOK.
                 * Formel for utregning ligger i Valuta fil
                 */
                case 1:
                    System.out.println("Velg 1 for å regne til NOK eller 2 for å regne fra NOK.");
                    Double valg2 = scanner.nextDouble();

                    if (valg2 == 1){

                        System.out.println("Skriv inn mengde.");
                        double antall = scanner.nextDouble();
                        double resultat = dollar.tilNOK(antall);

                        System.out.println(antall +"$ blir til "+ resultat +" NOK" );
                    }

                    if (valg2 == 2){

                        System.out.println("Skriv inn mengde.");
                        double antall = scanner.nextDouble();
                        double resultat = dollar.fraNOK(antall);

                        System.out.println(antall +" NOK blir til "+ resultat +" $");
                    }

                    break;

                /* CASE 2 utgjør for Euro */    
                case 2:
                    System.out.println("Velg 1 for å regne til NOK eller 2 for å regne fra NOK.");
                    Double valg3 = scanner.nextDouble();

                    if (valg3 == 1){

                        System.out.println("Skriv inn mengde.");
                        double antall = scanner.nextDouble();
                        double resultat = euro.tilNOK(antall);

                        System.out.println(antall +" £ blir til "+ resultat +" NOK" );
                    }

                    if (valg3 == 2){

                        System.out.println("Skriv inn mengde.");
                        double antall = scanner.nextDouble();
                        double resultat = euro.fraNOK(antall);

                        System.out.println(antall +" NOK blir til "+ resultat +" £");
                    }

                break;
                    
                /* CASE 3 utgjør for Svenske krona */
                case 3:
                    System.out.println("Velg 1 for å regne til NOK eller 2 for å regne fra NOK.");
                    Double valg4 = scanner.nextDouble();

                    if (valg4 == 1){

                    System.out.println("Skriv inn mengde.");
                    double antall = scanner.nextDouble();
                    double resultat = svenskKrona.tilNOK(antall);

                    System.out.println(antall +" svenske krona blir til "+ resultat +" NOK" );
                    }

                    if (valg4 == 2){

                    System.out.println("Skriv inn mengde.");
                    double antall = scanner.nextDouble();
                    double resultat = svenskKrona.fraNOK(antall);

                    System.out.println(antall +" NOK blir til "+ resultat +" svenske krona");
                    }
            }
        }
    }
}

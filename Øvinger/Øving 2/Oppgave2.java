public class Oppgave2 {
    public static void main(String[] args) {


        //Kjøttstykker sin vekt
        double kjottA = 35.90;

        double kjottB = 39.50;
        
        
        //Formel for kjøttvekt og pris
        double prisPerGramA = kjottA / 450.0;

        double prisPerGramB = kjottB / 500.0;


        //Utsagn
        if (prisPerGramA < prisPerGramB) {
            System.out.println("Kjøtt A er billigst");
        }

        if (prisPerGramA > prisPerGramB) {
            System.out.println("Kjøtt B er billigst");
        }
    }
}

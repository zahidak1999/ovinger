public class Oppgave2 {
    public static void main(String[] args) {
        
        //Antall sekunder, minutter og timer.
        int sek = 20;
        int minutter = 18;
        int timer = 4;

        //Funksjon for tid.
        int sekslutt = timer * 3600 + minutter * 60 + sek;
        System.out.println(sekslutt + " totale sekunder");
    }
   
}

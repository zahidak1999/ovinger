public class Oppgave3 {
    public static void main(String[] args) {

        //Antall sekunder.
        int tot_sek = 3700;

        //Funksjon for tid
        int timer = tot_sek / 3600;
        int sek_etter_timer = tot_sek % 3600;
        int min = sek_etter_timer/60;
        int sek_etter_min = sek_etter_timer%60;

        System.out.println(timer + " timer, " + min + " min og " + sek_etter_min + " sekunder.");
    }
}

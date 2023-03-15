import static javax.swing.JOptionPane.*;
public class Oppgave1 {
    public static void main(String[] args) {
        

        //Hvilket år
        String Readyear = showInputDialog("Hvilket år?");

        int year = Integer.parseInt(Readyear);

        //Funksjon for å finne ut hvilket år
        boolean funksjon1 = (year % 4 == 0) && (year % 100 != 0);
        boolean funksjon2 = (year % 1000) % 400 == 0;
        
        //Om det er skuddår eller ikke
        if (funksjon1||funksjon2) {
            showMessageDialog(null, year + " er et skuddår");
        }
        else {
            showMessageDialog(null, year + " er ikke et skuddår");
        }
    }
}
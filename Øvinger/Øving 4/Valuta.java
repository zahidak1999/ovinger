public class Valuta {
    
    private double kurs;

    /* konstrøktør for kursen */
    public Valuta (double kurs){
        this.kurs = kurs;
    }

    /* Setter opp formel for konvertering fra og til kroner */
    public double tilNOK(double antall){
        return antall * kurs;
    }

    public double fraNOK (double antall){
        return antall * (1/kurs);
    }
}

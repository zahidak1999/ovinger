/* Setter opp klassen for brøk */
public class Fraction {

    /* Bruker private konstruktører for å senere bruke get-metode */
    private double numerator, denominator;

    public Fraction(double numerator) {
        this.numerator = numerator;
        this.denominator = 0;
    }

    public Fraction(double numerator, double denominator) {
        if (denominator == 0){
            throw new IllegalArgumentException("Nevneren kan ikke være lik 0");
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }
    /* Get-metode for å hente nevner og teller sine attributter */
    public double getNumerator() {
        return this.numerator;
    }

    public double getDenominator() {
        return this.denominator;
    }

    // Setter opp formlene for addering, subtrering, multiplisering, og dividering i metoder 
    public void add(Fraction fraction) {
        this.numerator = (this.numerator * fraction.denominator) + (fraction.numerator * this.denominator);
        this.denominator = this.denominator * fraction.denominator;
    }

    /**
     * metoden subtraherer
     * @param fraction 
     */
    public void subtract(Fraction fraction) {
        this.numerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        this.denominator = this.denominator * fraction.denominator;
    }

    public void multiply(Fraction fraction) {
        this.numerator = this.numerator * fraction.numerator;
        this.denominator = this.denominator * fraction.denominator;
    }

    public void divide(Fraction fraction) {
        this.numerator = this.numerator * fraction.denominator;
        this.denominator = this.denominator * fraction.numerator;
    }

    public void simplify(Fraction fraction) {
        
    }
}
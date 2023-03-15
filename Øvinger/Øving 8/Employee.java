public class Employee {
    
    /**
     * Henter informasjon fra Person klassen for å lag personalia attribut.
     */
    Person personalia;

    /**
     * Lager attributer for arbeidstaker
     */
    java.util.GregorianCalendar calender = new java.util.GregorianCalendar();
    int employeeNumber;
    String employedDate;
    double monthlySalary;
    double taxRate;
    int year = calender.get(java.util.Calendar.YEAR);

    /**
     * Lager konstruktør for hvert objekt
     * @param personalia
     * @param employeeNumber
     * @param employedDate
     * @param monthlySalary
     * @param taxRate
     */
    public Employee(Person personalia, int employeeNumber, String employedDate, double monthlySalary, double taxRate){
        this.personalia = personalia;
        this.employeeNumber = employeeNumber;
        this.employedDate = employedDate;
        this.monthlySalary = monthlySalary;
        this.taxRate = taxRate;
    }

    /**
     * Metode for å returnere personalia til personen i klient filen.
     * @return personalia
     */
    public Person personalia() {
        return personalia;
    }

    /**
     * Bruker bursdagsåret til Person.java for å finne alderen til personen.
     * @return age
     */
    public int Age() {

        int age = year - personalia.getBirthYear();

        return age;

    }

    public String getName(){
        return this.personalia().getSurName() + ", " + this.personalia().getFirstName();
    }

    /**
     * Metode for å retunere lønn.
     * @return monthlySalary
     */
    public double getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * Metode for å sette en ny lønn i Main-klienten.
     * @param newMonthlySalary
     */
    public void setMonthlySalary(double newMonthlySalary) {
        this.monthlySalary = newMonthlySalary;
    }

    /**
     * Metode for å regne årslønn.
     * @return  netto-årslønn
     */
    public double YearlySalary() {
        return monthlySalary * 12;
    }

    /**
     * Metode for å sette skatten.
     * @return  skatterenten
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Metode for å sette ny skatterente i klienten.
     * @param newTaxRate
     */
    public void setTaxRate(double newTaxRate) {
        this.taxRate = newTaxRate;
    }

    /**
     * Metode for å regne ut månedlig skatt.
     * @return  Skatten månedlig
     */
    public double TaxesMonthly() {
        return monthlySalary * taxRate / 100;
    }

    /**
     * Metode for å regne ut hvor mye skatt de betaler årlig.
     * @return  Skatten i året
     */
    public double TaxesYearly() {
        double taxesYearly = 0;
        for(int month = 1; month <= 12; month++){
            if(month == 6){
                continue;
            } else if (month == 12) {
                taxesYearly += TaxesMonthly()/2;
            }
            else {
                taxesYearly += TaxesMonthly();
                
            }
        }
        return taxesYearly;
    }    
}
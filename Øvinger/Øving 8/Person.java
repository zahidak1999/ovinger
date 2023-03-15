public final class Person {
    
    /**
     * Gjør objektene privat.
     */
    private String firstName;  
    private String surName;
    private int birthYear;

    /**
     * Lager konstruktør for hvert objekt
     * @param firstName Fornavn
     * @param surName   Etternavn
     * @param birthYear Bursdagsåret
     */
    public Person(String firstName, String surName, int birthYear) {
        this.firstName = firstName;
        this.surName = surName;
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSurName() {
        return surName;
    }
    
}

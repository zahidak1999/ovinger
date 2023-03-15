public class NewString {

    /**
     * Lager konstruktør og gjør klassen privat/immutabel.
     */
    private final String text;
    public NewString(String words) {
        this.text = words;
    }
    
    /**
     * Metode for å forkorte setningene. 
     * @return newText
     */
    public String abbreviate() {
        String newText = "";
        String[] words = text.split(" ");
        for (String word : words) {
            newText += word.charAt(0);
        }
        return newText;
    }

    /**
     * Metode for å fjerne en bestemt bokstav.
     * @param removal   Bokstav som skal fjernes
     * @return          Streng uten ordet
     */
    public String remove(char removal) {
        String newText = this.text;
        while (newText.indexOf(removal) > -1){
            newText = newText.substring(0, newText.indexOf(removal)) + newText.substring(newText.indexOf(removal) + 1);
        }
        return newText;
    }

}
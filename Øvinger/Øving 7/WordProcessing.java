public class WordProcessing {
    
    /**
     * Lager konstruktør for teksten og gjør.
     * Gjør objektet vi skriver inn privat.
     */
    private final String text;
    public WordProcessing (String text) {
        this.text = text;
    } 

    /**
     * Metode for å telle ord
     * @return words.length
     */
    public int wordCounter() {
        String[] words = text.split(" ");
        return words.length;
    }

    /**
     * Metode for å regne gjennomsnitt av bokstaver per ord.
     * @return average
     */
    public double averageWordLength() {
        String[] words = text.split("\\P{L}+"); //unicode????
        double totalLetters = 0;
        for(String word : words) {
            totalLetters += word.length(); 
        }

        double average = totalLetters / wordCounter();

        return average;
    }

    /**
     * Metode for å regne gjennomsnitt av ord per setning. Blir skilt av tegnene: .!:?
     * @return averagePeriod
     */
    public double averageWordsPerSentence() {
        String[] sentence = text.split("[.!:?]+"); 

        double averagePeriod = wordCounter() / sentence.length ;

        return averagePeriod;
    }

    /**
     * Metode for å bytte ut alle ordene som er det samme med noe nytt.
     * @param textWord
     * @param replace
     * @return text
     */
    public String replaceWord(String textWord, String replace) {
        String text = this.text;
        text = text.replaceAll(textWord, replace);
        return text;
    }
    
    /**
     * Metode for å se teksten igjen.
     * @return this.text
     */
    public String wholeText() {
        return this.text;
    }

    /**
     * Metode for å gjøre alle bokstaver store.
     * @return text
     */
    public String wideText() {
        String text = this.text;
        text = text.toUpperCase();
        return text;
    }
}
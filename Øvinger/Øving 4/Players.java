public class Players {

    /* Spillerne starter på 0 */
    private int sumPoint = 0;

    /* randomizing av terningkastene */
    java.util.Random dice = new java.util.Random();

    /* Operasjon for å kaste terning. throwDice går fra 0-5, så plusser på 1 for å simulere terninger. */
    void throwDice(){
        int throwDice = dice.nextInt(6) + 1;
        if (throwDice == 1){
            sumPoint = 0;
        } else {
            sumPoint = sumPoint + throwDice;
        }
        
    } 

    int getPointSum(){
        return sumPoint;
    }
    boolean done (){
        return sumPoint >= 100;
    }

}

public class Dice100 {
    public static void main(String[] args) {

        System.out.println("May the dice be ever in your favour.");

        /* Lager objekter ut fra Players.java */
        Players player1 = new Players();
        Players player2 = new Players();


        /* Variabel for runder */
        int round = 1;

        /* WHILE-løkke for at spillet går helt opp til en spiller har vunnet.
         * Spiller 1 og spiller 2 kaster terning samtidig.
         */
        while (!player1.done() && !player2.done()){

            player1.throwDice();
            player2.throwDice();

            System.out.println("runde "+ round);
            System.out.println("Player 1 sin poengsumm:"+ player1.getPointSum());
            System.out.println("Player 2 sin poengsumm:"+ player2.getPointSum());
            round++;

            /* Utprinting av vinner over spillet. */
            if(player1.done()){
                System.out.println("Player 1 wins!");
            } else if (player2.done()) {
                System.out.println("Player 2 wins!");
            }
            

            }
        }
    }


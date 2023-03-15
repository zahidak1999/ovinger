import java.util.Scanner;

public class Oppgave2{
    public static void main(String[] args) {
        boolean kjør = true;

        //while-løkke for å få skiten til å fortsette
        while (kjør){
            System.out.println("Skriv et tall, 0 for å avslutte");
            Scanner scanner = new Scanner (System.in);
            try {
                int tall = scanner.nextInt();

            boolean primtall = true;

            //sjekker om det er delelig med tallet 2, opp til tallet mindre enn du har skrevet inn
            for(int i = 2; i < tall; i++){
                if (tall % i == 0){
                    primtall = false;
                    break;
                }
            }

            //meldingene
            if (primtall || tall <= 1){
                System.out.println( tall +" er et primtall");

            }else{
                    System.out.println(tall +" er ikke et primtall");
            }
            if(tall == 0){
                System.out.println("Programmet avsluttes");
                kjør = false;
            }
        } catch(Exception e){
            System.out.println("Vennligst tast inn et heltall");
        }
    }
}
}
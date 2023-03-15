public class MyRandomClient {
    public static void main(String[] args) {

         MyRandom object = new MyRandom();
        

        for(int i = 0; i <100; i++) {
            object.nextWholeNumber(1, 100);
            System.out.println(object.nextWholeNumber(1, 100));
        }

        for(int j = 0; j <100; j++) {

            object.nextDecimalNumber(1.0, 2.0);

            System.out.println(object.nextDecimalNumber(1, 2));
        }    
    }
}

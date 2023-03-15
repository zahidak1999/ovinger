import java.io.*;

public class Test {
    
    public static void main(String[] args) throws IOException {
        
        int pos = 0;
        int neg = 0;

        System.out.println("Please enter a number: ");
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        int inputNumber = Integer.parseInt(inputString);

        while(inputNumber != 0) {
            if(inputNumber >0) {
                pos = pos + 1;
            } else {
                neg = neg + 1;
            }
            System.out.println("Please enter another number: ");
            inputNumber =  Integer.parseInt(br.readLine());
        }

        System.out.println("Total positive numbers: " + pos);
        System.out.println("Total negative numbers: " + neg);
    }
    
}

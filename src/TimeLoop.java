import java.util.Scanner;

public class TimeLoop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        for(int i= 1; i <= num; i++) {
            System.out.println(i + " Abracadabra"); 
        }
    }

}
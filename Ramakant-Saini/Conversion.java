//WAP to take input rupees from the user and convert it into paise.
import java.util.Scanner;
public class Conversion {
    public static int rupeeToPaisa(int rupees){
        return(rupees*100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int rupees=sc.nextInt();
        System.out.println(rupeeToPaisa(rupees));
    }

    
}

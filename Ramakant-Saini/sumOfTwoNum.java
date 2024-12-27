import java.util.Scanner;
public class sumOfTwoNum {
    public static double sum(double num1,double num2){
        return(num1 +num2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        double num1=sc.nextDouble();
        System.out.print("Enter the Second Number : ");
        double num2=sc.nextDouble();
        System.out.println("Sum of two number is : "+ sum(num1,num2));
     }
}

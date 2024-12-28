//WAP to calculate and print area of circle and circumference of circle.

import java.util.Scanner;
public class CircleFunction{
    public static double calculateArea(double radius){
        return (Math.PI*Math.pow(radius,2));
        
    }
    public  static double calculateCircumference(double radius){
            return (2*Math.PI*radius);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius=sc.nextDouble();
        System.out.println("Area Of Circle is : "+ calculateArea(radius));
        System.out.println("Circumference Of Circle is : "+ calculateCircumference(radius));
    }
    
} 
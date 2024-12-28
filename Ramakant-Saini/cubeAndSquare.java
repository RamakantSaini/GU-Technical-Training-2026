//WAP to take input 1 number from the user and print its square and cube.

import java.util.Scanner;
public class cubeAndSquare {
    //Function to find Square of any number
    public static double square(double num){
        return (Math.pow(num,2));
    }
    //Function to find cube  of any number
    public static double cube(double num){
        return(Math.pow(num,3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        double num=sc.nextDouble();
        System.out.println("Square is : "+ square(num));
        System.out.println("Cube is : "+ cube(num));
        
    }
    
}


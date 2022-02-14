package Program;
//this program calculates the radius,area,circumference of a circle.
//encoded by encoder on 2/13/22

//import declaration
import java.util.Scanner;

//class declaration
public class circle {

    public static void main(String[] args) {//method begins
   //scanner declaration
   Scanner input = new Scanner(System.in);
//variable declaration
float Radius;
float Diameter;
double Circumference;
double Area;
//prompt
 System.out.print("Enter the radius: ");
 Radius = input.nextInt();

 Diameter = 2 * Radius;
  System.out.println("the diameter is " +Diameter);

  Circumference = 2 * Math.PI * Radius;
 System.out.println("the circumference is: " +Circumference);

 Area = Math.PI * (Radius * Radius);
  System.out.println("the area is: " +Area);

    }//method ends




}

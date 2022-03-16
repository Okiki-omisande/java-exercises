//this program calculates the body mass index of any human being
//Also,display the standard health gauge information from the Department of Health and
//Human Services/National Institutes of Health so the user can evaluate his/her BMI
package Program;

//import declaration
import java.util.Scanner;

//class declaration
public class bodymassindex {//class body begins

    public static void main(String[] args) {//method begins
       //scanner declaration
        Scanner input = new Scanner(System.in);

        //variable declaration
        double A;
        double B;
        double C;

        //prompt
        System.out.println("ENTER WEIGHT IN KG:");
        A = input.nextInt();

        System.out.println("ENTER HEIGHT IN METERS");
        B = input.nextDouble();

        C =   A/(B*B);

        //statement declaration
    System.out.println("Your BMI is " +C );

    System.out.println("BMI VALUES from the Ministry of Health");
    System.out.println("Underweight: less than 18.5");
    System.out.println("Normal: between 18.5 and 24.9");
    System.out.println("Overweight: between 25 and 29.9");
    System.out.println("Obese: 30 or greater");
    }//method ends
}//class body ends

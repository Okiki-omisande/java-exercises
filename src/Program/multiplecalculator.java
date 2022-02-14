package Program;
//this application perform multiple  calculation action its Add Subtract Multiply Divides.
//Encoded by encoder on 10/2/22

//import declaration
import java.util.Scanner;

//class declaration
public class multiplecalculator {//class body begins

    //method declaration
    public static void main(String[] args) {//method begins

        //scanner declaration
        Scanner input =new Scanner(System.in);

        //variable declaration
        int Input1;
        int Input2;
        int Sum;
        int Subtraction;
        int Division;
        int Quotient;
        int Multiplication;

        //prompt begins
        System.out.println("Enter first input here ");
        Input1 = input.nextInt();

        System.out.println("Enter second input here ");
        Input2 = input.nextInt();

        Multiplication = Input1 * Input2;
                System.out.printf("product is %d%n", Multiplication);


        Division = Input1 / Input2;
                System.out.printf("division is %d%n", Division);

                Quotient = Input1 % Input2;
                System.out.printf("Quotient is %d%n", Quotient);

        Sum = Input1 + Input2;
        System.out.printf("sum is %d%n", Sum);

        Subtraction = Input1 - Input2;
                System.out.printf("subtraction is %d%n", Subtraction );
                //prompt ends






    }//methods ends
}//class body ends

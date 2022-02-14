package Program;

//this program calculates the product of 3 inputs X,Y,Z
//encoded by encoder on 8/02/22

//import declaration//

import java.util.Scanner;

//class declaration
public class multiplication {// class body

    public static void main(String[] args) {//method begins

        //Scanner declaration
        Scanner input = new Scanner(System.in);

        //variable declaration
        int X;
        int Y;
        int Z;
        int Result;

        // statement declaration
        System.out.println("Enter input here: ");
        X = input.nextInt();

        System.out.println("Enter input here: ");
        Y = input.nextInt();

        System.out.println("Enter input here: ");
        Z = input.nextInt();

    Result = X * Y * Z;
        System.out.printf(" Result is %d%n " , Result );
    }// end of method
}//end of class body


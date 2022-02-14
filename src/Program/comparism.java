package Program;

//this program compares two numbers
//Encoded by encoder on 10/02/22

//import declaration
import java.util.Scanner;

//class declaration
public class comparism {//class body begins

    //method declaration
    public static void main(String[] args) {//method declaration begins

        //Scanner declaraton
        Scanner input = new Scanner(System.in);

        //variable declaration
        int Input1;
        int Input2;

        //prompt
        System.out.println("Enter first integer here:");
        Input1 = input.nextInt();

        System.out.println("Enter second integers here:");
        Input2 = input.nextInt();

        if ( Input1 > Input2)
            System.out.printf(" the biggest number is %d%n", Input1);

        if ( Input1 < Input2)
            System.out.printf("the biggest number is %d%n", Input2);

        if (Input1 == Input2)
            System.out.printf("this expression is equal");



    }//method declaration ends
}//clas ends

package Program;
// this program compares two numbers
// encoded by encoder on 5/2/22

//import declaration
import java.util.Scanner;

//class declaration
public class comparison {//class body begins

    //method declaration
    public static void main(String[] args) {// method begins

        //scanner declaration
        Scanner Input = new Scanner(System.in);

    //variable declaration
   int Figure1;
   int Figure2;
   int Sum;

   //Statement declaration
        System.out.print("Enter first integer here: ");
        Figure1 = Input.nextInt();

        System.out.print("Enter second integer here: ");
        Figure2 = Input.nextInt();

        Sum = Figure1 + Figure2;
        System.out.printf("sum is %d%n", Sum);

   //conditional statement
        if (Figure1 == Figure2)
            System.out.printf("%d == %d%n", Figure1, Figure2);

        if (Figure1 != Figure2)
            System.out.printf("%d != %d%n", Figure1, Figure2);

        if (Figure1 > Figure2)
            System.out.printf("%d . %d%n", Figure1, Figure2);

        if (Figure1 < Figure2)
            System.out.printf("%d < %d%n", Figure1, Figure2);

        if (Figure1 >= Figure2)
            System.out.printf("%d >= %d%n", Figure1, Figure2);

        if (Figure1 <= Figure2)
        System.out.printf("%d <= %d%n", Figure1, Figure2);

    }//method ends

} //class body ends

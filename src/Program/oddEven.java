package Program;
//this program determines whether an input is odd or even
//encoded by encoder on 2/11/22

//import declaration
import java.util.Scanner;

//class declaration
public class oddEven {//class body begins

    public static void main(String[] args) {//method begins

        //scanner declaration
        Scanner input = new Scanner(System.in);

        //variable declaration
        int Input1;

        //prompt
        System.out.print("Enter the number you want to check here: ");
        Input1 = input.nextInt();

        if (Input1 % 2 != 0)
        {
            System.out.println("the given number "+Input1+" is odd");
        }

        else
        {
            System.out.println("this given "+Input1+" number is even");
        }

        }//method ends
}//class body ends

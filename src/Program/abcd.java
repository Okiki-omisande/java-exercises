//the purpose of this code is to run an application that receives four input a,b,c,d and calculate their average
//encoded by encoder on the 16/3/22
package Program;

//import declaration
import java.util.Scanner;

//class declaration
public class abcd {//class body begins

//method declaration
public static void main(String[] args) {//method begins

//scanner declaration
Scanner input = new Scanner(System.in);

//variable declaration
int A;
int B;
int C;
int D;
int AVERAGE;

//prompt
System.out.println("ENTER FIRST QUERY:");
A = input.nextInt();

System.out.println("ENTER SECOND QUERY:");
B = input.nextInt();

System.out.println("ENTER THIRD QUERY:");
C = input.nextInt();

System.out.println("ENTER FOURTH QUERY:");
D = input.nextInt();

AVERAGE = (A+B+C+D)/4;

//statement declaration
    System.out.printf("AVERAGE is %d%n", AVERAGE);

}//method ends
}//class body ends

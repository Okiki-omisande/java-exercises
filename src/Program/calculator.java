package Program;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int Input1;
        int Input2;
        int Input3;
        int sum;

        System.out.print("Enter first input here : ");
                Input1 = input.nextInt();

                System.out.print("Enter second input here: ");
                        Input2 = input.nextInt();

                        System.out.println("Enter third number here: ");
                        Input3 =input.nextInt();

                sum = Input1 + Input2 + Input3;

        System.out.printf("Sum is %d%n", sum );

        }
}

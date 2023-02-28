package hw4;
import java.util.Scanner;
/*
 * @class: SumInput
 * @author: Eden Truong
 * @course: ITEC 2140
 * @written: February 25, 2023
 * @description: Accepts interger from user and inputs the sum
 */
public class SumInput {
    public static void main(String[] args) {
        Scanner conIn = new Scanner(System.in);
        System.out.println("Enter a number");
            int num = conIn.nextInt();
            int sum = 0;
            while (num != 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
        System.out.println("the sum of the number you entered is " + sum);
    }
}

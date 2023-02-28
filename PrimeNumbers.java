package hw4;
import java.util.Scanner;
/*
 * @class: PrimeNumbers
 * @author: Eden Truong
 * @course: ITEC 2140
 * @written: February 25, 2023
 * @description: input a number to see if number is prime.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner conIn = new Scanner(System.in);
        System.out.println("Please input a number");
        int num = conIn.nextInt();
        //Condition for true false statement
        boolean primeFlag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                primeFlag = true;
                break;
            }
        }
        if (!primeFlag) {
            System.out.println(num + " is a prime number!");
        }
        else {
            System.out.println(num + " is not a prime number :(");
        }
    }
}

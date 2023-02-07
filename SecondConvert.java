/*
 * @class: SecondConvert
 * @author: Eden Truong
 * @course: ITEC 2140
 * @written: February 7th, 2023
 * @description: Converting a large number of seconds, into a HH:MM:SS format
 */
import java.util.Scanner;

public class SecondConvert {
    public static void main(String args[]) {
        Scanner cInput = new Scanner(System.in);
        System.out.println("Enter your total amount of seconds:");
        int totalSec = cInput.nextInt(); //input for total seconds

        int hour = totalSec / 3600;
        int min = (totalSec % 3600) / 60; //i learned today that to convert total seconds to minute you can use modulo which is SICK.
        int secs = totalSec % 60; //same with seconds!

        System.out.println("your converted time is: " + hour + " hour(s) : " + min + " minute(s) : " + secs + " second(s)");
    }
}

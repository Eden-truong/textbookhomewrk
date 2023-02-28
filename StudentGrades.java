package hw4;
import java.util.Scanner;
/*
 * @class: StudentGrades
 * @author: Eden Truong
 * @course: ITEC 2140
 * @written: February 25, 2023
 * @description: Average of student grades
 */
public class StudentGrades {
    public static void main(String[] args) {
        Scanner conIn = new Scanner (System.in);
        System.out.println("Please input the amount of grades to be averaged.");
        int amnt = conIn.nextInt();
        System.out.println("Please submit your grades!");
        double input;
        double sum = 0;
        double average;
        int x = 0;
        while (x != amnt) {
            input = conIn.nextDouble();
            sum += input;
            x++;
        }
        average = sum / amnt;
        System.out.println("The average of " + amnt + " grades is " + average);
        //for loop for repeating vars
        //im too tired with while loops, sorry gonna just ask for user input on how many grades they want to submit in.

    }
}

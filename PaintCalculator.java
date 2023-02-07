/*
 * @class: PaintCalculator
 * @author: Eden Truong
 * @course: ITEC 2140
 * @written: February 7th, 2023
 * @description: Calculation for amount of paint needed for house
 */
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String args[]) {
        Scanner cInput = new Scanner(System.in);
        System.out.println("Length of room? (in feet)");
        long l = cInput.nextLong();

        System.out.println("Width of room? (in feet)");
        long w = cInput.nextLong();

        System.out.println("Height of room? (in feet)");
        long h = cInput.nextLong();

        System.out.println("Number of windows?");
        long window = cInput.nextLong();

        System.out.println("Number of doors?");
        long door = cInput.nextLong(); //literally all the inputs

        //beginning of functions to be used to calculate the amount of paint
        int sqFtRoom = (int) (2 *(l + w + h));
        long sqFtDoor = (door * 21);
        long sqFtWindow = (window * 15);
        double paintNeeded = 350 / (sqFtRoom + sqFtDoor + sqFtWindow);

        System.out.println("With the measurements you give, you will need " + paintNeeded + " cans of paint");

    }
}

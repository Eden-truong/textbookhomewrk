import java.util.Scanner;

/*
 * @alass: CylinderArea
 * @author: Eden Truong
 * @course: ITEC 2140
 * @written: February 7th 2023
 * @description: A function for determining cylinder area
 */
public class CylinderArea {
    public static void main(String args[]) {
        Scanner cInput = new Scanner(System.in);

        System.out.println("enter a radius:");
        double r = cInput.nextDouble();

        System.out.println("enter a height:");
        double h = cInput.nextDouble(); //the variables

        double bArea = (3.1416 * r * r);
        double volume = (3.1416 * r * r * h); //the formulas

        System.out.println("Your base area is: " + bArea + ", and your cylinder volume is: " + volume);
    }

}

/*
 * @class: SpeedLight
 * @author: Eden Truong
 * @course: ITEC 2140
 * @written: January 26th, 2023
 * description: Circle Area and Perimeter if theres a radius of 9.5
 */
public class Circle {
    public static void main(String[] args) {
        double radius = 5.6; //given radius
        double circleCircum = 2 * radius; //function for circle circumference
        double circleArea = 3.14 * Math.pow(radius, 2); //function of circle area
        System.out.println("Area of this circle is: " + circleArea + ", And the Perimeter is: " + circleCircum);
    }
}

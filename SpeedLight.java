/*
 * @class: SpeedLight
 * @author: edentruong
 * @course: ITEC 2140
 * @written: Jan 26th, 2023
 * description: calculation of the speed of sound 5 seconds away from thunder.
 */
public class SpeedLight {
    public static void main(String[] args) {
        int speedOfLight = 340; //constant variable with a constant value (as in it doesn't change)
        int timeElapsed = 5;
        int distance = speedOfLight * timeElapsed; //function, duh.
        System.out.println("Speed of Light: " + speedOfLight);
        System.out.println("Time elapsed: " + timeElapsed);
        System.out.println("Distance away from lightning: " + distance);
    }
}

/*
 * @class: Cycle
 * @author: Eden Truong
 * @course: ITEC 2140
 * @written: January 26th, 2023
 * description: Amount of Tricycles from 10 bicycles and 47 total wheels.
 */
public class Cycle {
    public static void main(String[] args) {
        int bicycles = 10;
        int totalWheels = 47;
        int bicycleWheels = bicycles * 2; //finding the amount of wheels from the 10 bicycles
        int trikeWheels = totalWheels - bicycleWheels; //finding the tricycle wheels for tricycles
        int tricycles = trikeWheels / 3; //var with the function above ^

        System.out.println("There are " + bicycles + " bicycles, and x amount of tricycles.");
        System.out.println("we are given 47 wheels, knowing that there are " + bicycles + " bicycles this gives us " + bicycleWheels + " bicycle wheels" + ".");
        System.out.println("then we subtract that amount with 47 wheels, " + "leaving us with " + trikeWheels + " tricycle wheels, then we divide it by 3 wheels, leaving us with " + tricycles + " tricycles.");
    }
}

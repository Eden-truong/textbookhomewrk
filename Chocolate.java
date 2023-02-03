/*
 * @class: Chocolate
 * @author: Eden Truong
 * @course: ITEC 2140
 * @written: January 26th, 2023
 * description: Amount of chocolate bags if there's 3 chocolate bars per bag instead of 2.
 */
public class Chocolate {
    public static void main(String[] args) {
        int newbarPerBag = 3; //the amount of new bars per bag
        int chocoBars = 18; //total amount of chocolate bars
        int originalBag = 9; //original amount of chocolates in a bag this and the var above is used for a division
        int answer = chocoBars / newbarPerBag;

        System.out.println("If there were to be 3 chocolate bars per bag instead of 2, there would be " + answer + " bags of chocolate instead of " + originalBag);
    }
}

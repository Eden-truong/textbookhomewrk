/*
 * @class: FindX
 * @author: Eden Truong
 * @course: ITEC 2140
 * @written: January 26th, 2023
 * description: Finding X from a given problem.
 */
public class FindX {
    public static void main(String[] args) {
        int a = 5;
        int b = 19;
        int c = 47;
        int d = 194; //a to d are just variables with x being the unknown variable
        int x = d - c - b - a;

        System.out.println("Given 5 + 19 + X + 47 = 194, to find X we just subtract 194 to 47, 19, 5, leaving us with " + x);
    }
}

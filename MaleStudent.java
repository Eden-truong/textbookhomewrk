/*
 * @class: MaleStudent
 * @author: Eden Truong
 * @course: ITEC 2140
 * @written: January 26th, 2023
 * description: Calculation of Male Students from a middle school
 */
public class MaleStudent {
    public static void main(String[] args) {
        int totalStudents = 389;
        int femaleStudents = 175; //given vars
        int maleStudents = totalStudents - femaleStudents; //function for male students

        System.out.println("Knowing that there are 389 total students, and there are 175 female students, " +
                "if we subtract female students from the total students, we are left with: " + maleStudents + " Male Students");
    }
}

// CODSOFT TASK NO. 2 -> STUDENT GRADE CALCULATOR 

package studentGradeCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE STUDENT GRADE CALCULATOR!");
        System.out.print("\nEnter your marks in Math out of 100: ");
        int math = sc.nextInt();
        System.out.print("\nEnter your marks in Science out of 100: ");
        int sci = sc.nextInt();
        System.out.print("\nEnter your marks in English out of 100: ");
        int eng = sc.nextInt();
        System.out.print("\nEnter your marks in History out of 100: ");
        int hist = sc.nextInt();
        System.out.print("\nEnter your marks in Geography out of 100: ");
        int geo = sc.nextInt();
        int totalMarks = math + sci + eng + hist + geo;
        char grade = 'F';
        double avgPercentage = (double) totalMarks / 5;
        if (avgPercentage > 90) {
            grade = 'A';
        } else if (avgPercentage > 75) {
            grade = 'B';
        } else if (avgPercentage > 60) {
            grade = 'C';
        } else if (avgPercentage > 50) {
            grade = 'D';
        } else if (avgPercentage > 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("\nTotal marks: " + totalMarks + " out of 500\nAverage percentage: " + avgPercentage
                + "%\nGrade: " + grade);
        sc.close();
    }
}

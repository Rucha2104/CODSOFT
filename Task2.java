
//NAME: RUCHA CHAVAN
//TASK 2: STUDENT GRADE CALCULATOR
//CODSOFT INTERNSHIP

import java.util.Scanner;
public class MarksCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // number of subjects
        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();

        //storing marks for each subject
        int[] marks = new int[n];

        // Get marks for each subject
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        // Calculate total marks
        int totalMarks = 0;
        for (int i = 0; i < n; i++) {
            totalMarks += marks[i];
        }

        // average percentage
        float avgPer = (float) (totalMarks / n);

        // grade based on average percentage
        char grade;
        if (avgPer >= 90) {
            grade = 'A';
        } else if (avgPer >= 80) {
            grade = 'B';
        } else if (avgPer >= 70) {
            grade = 'C';
        } else if (avgPer >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Displaying results
        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Average percentage of your marks is : " + avgPer + "%");
        System.out.println("Grade obtained: " + grade);
    }
}

import java.util.Scanner;

public class gradeCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Input marks for each subject
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; ++i) {
            System.out.printf("Enter marks for Subject %d (out of 100): ", i);
            int marks = scanner.nextInt();

            // Validate marks
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
                return;
            }

            // Sum up the total marks
            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Display results
        System.out.println("\nResults:");
        System.out.printf("Total Marks: %d\n", totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);

        // Grade Calculation
        System.out.print("Grade: ");
        if (averagePercentage >= 90) {
            System.out.println("A");
        } else if (averagePercentage >= 80) {
            System.out.println("B");
        } else if (averagePercentage >= 70) {
            System.out.println("C");
        } else if (averagePercentage >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the Number of Subjects");
            int NumOfSubjects = scanner.nextInt();
            int Totalmarks = 0;

            for (int i = 1; i <= NumOfSubjects; i++) {
                System.out.println("Enter the marks obtained in Subject" + i + "(out of 100)");
                int marks = scanner.nextInt();

                // valid input
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid Input: Marks should be between 0 and 100, Exit");
                    return;

                }
                Totalmarks += marks;

            }

            // avgpercentage
            double avgpercentage = (double) Totalmarks / NumOfSubjects;
            System.out.println("\nResults:");
            System.out.println("Totalmarks:" + Totalmarks);
            System.out.println("AvgPercentage:" + avgpercentage);

   // grade calculation
    char grade;

    if(avgpercentage>=90)
    {
            grade = 'A';
    }else if(avgpercentage>=80)
    {
            grade = 'B';
    }else if(avgpercentage>=70)
    {
            grade = 'C';
    }else if(avgpercentage>=60)
    {
            grade = 'D';
    }else
    {
            grade = 'F';
    }

    System.out.println("Grade:" +grade);

    scanner.close();
        }

    }
}
import java.util.Scanner;

public class SIAKAD20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int studentCount = sc.nextInt();

        System.out.print("Enter number of courses: ");
        int courseCount = sc.nextInt();

        int[][] score = new int[studentCount][courseCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Enter scores for student #" + (i + 1));
            double sumForEachStudent = 0;

            for (int j = 0; j < courseCount; j++) {
                System.out.print("Course #" + (j + 1) + " score: ");
                score[i][j] = sc.nextInt();
                sumForEachStudent += score[i][j];
            }

            System.out.println("Average score: " + (sumForEachStudent / courseCount));
            System.out.println();
        }

        System.out.println("=== Course Averages ===");
        for (int j = 0; j < courseCount; j++) {
            double sumForEachCourse = 0;

            for (int i = 0; i < studentCount; i++) {
                sumForEachCourse += score[i][j];
            }

            System.out.println("Course " + (j + 1) + ": " + (sumForEachCourse / studentCount));
        }
    }
}

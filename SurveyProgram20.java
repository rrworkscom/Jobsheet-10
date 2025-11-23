import java.util.Scanner;

public class SurveyProgram20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int respondents = 10;
        int questions = 6;

        int[][] survey = new int[respondents][questions];

        System.out.println("=== Input Survey Data for 10 Respondents ===");
        for (int i = 0; i < respondents; i++) {
            System.out.println("\nRespondent #" + (i + 1));
            for (int j = 0; j < questions; j++) {
                System.out.print("Score for Question " + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== Average Score for Each Respondent ===");
        for (int i = 0; i < respondents; i++) {
            double sum = 0;
            for (int j = 0; j < questions; j++) {
                sum += survey[i][j];
            }
            System.out.println("Respondent " + (i + 1) + " average: " + (sum / questions));
        }

        System.out.println("\n=== Average Score for Each Question ===");
        for (int j = 0; j < questions; j++) {
            double sum = 0;
            for (int i = 0; i < respondents; i++) {
                sum += survey[i][j];
            }
            System.out.println("Question " + (j + 1) + " average: " + (sum / respondents));
        }

        double totalSum = 0;
        for (int i = 0; i < respondents; i++) {
            for (int j = 0; j < questions; j++) {
                totalSum += survey[i][j];
            }
        }

        double overallAverage = totalSum / (respondents * questions);
        System.out.println("\n=== Overall Average Score ===");
        System.out.println("Overall Average: " + overallAverage);
    }
}

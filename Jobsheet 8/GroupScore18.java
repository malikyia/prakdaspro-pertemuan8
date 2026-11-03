import java.util.Scanner;

public class GroupScore18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, score;
        float totalScore, avgScore;

        i = 1;
        while (i <= 6) {
            System.out.println("Group " + i);
            
            totalScore = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Score from Rater Group " + j + ": ");
                score = sc.nextInt();
                totalScore += score;
            }

            avgScore = totalScore / 5;
            System.out.println("Average score for Group " + i + " = " + avgScore);
            System.out.println(); // Baris kosong untuk pemisah antar kelompok

            i++;
        }

        sc.close();
    }
}
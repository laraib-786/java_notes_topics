import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Enter The score of the student: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        for(int i=0;i<5;i++){
            int score = sc.nextInt();
            scores.add(score);
        }
        Score score = new Score(scores);
        System.out.println("The percentage is: "+score.calculatePercentage());

    }
}
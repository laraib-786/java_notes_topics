import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Enter the score of the student: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        for(int i=0;i<5;i++){
            int score = sc.nextInt();
            scores.add(score);
        }
        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        Score score = new Score(scores);
        System.out.println("For student "+ name+ " the percentage is: "+score.getPercentage());

    }
}
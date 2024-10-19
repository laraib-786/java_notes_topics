import java.util.ArrayList;

public class Score{
    private ArrayList<Integer> scores;
    public Score(ArrayList<Integer> scores){
        this.scores = scores;
    }

    public double getPercentage(){
        double total = 0;
        for (Integer score : scores) {
            total += score;
        }
        return total/scores.size();
    }
}

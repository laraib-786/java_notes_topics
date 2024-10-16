import java.util.ArrayList;

public class Score{
    private ArrayList<Integer> scores;
    public Score(ArrayList<Integer> scores){
        this.scores = scores;
    }

    public int calculatePercentage(){
        int total = 0;
        for(int i=0;i<scores.size();i++){
            total += scores.get(i);
        }
        return total/scores.size();
    }
}

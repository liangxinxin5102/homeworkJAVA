package homeWork_6;

public class SingGame {
    public static void main(String[] args) {
        InputScore myInput = new InputScore();
        DeleteScore myDelet = new DeleteScore();
        ComputeAverageScore myConpare = new ComputeAverageScore();
        myConpare.myComputeAverageScore(myDelet.deleteScore(myInput.myScore()));
    }
}

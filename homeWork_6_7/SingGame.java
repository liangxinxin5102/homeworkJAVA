package homeWork_6_7;

public class SingGame {

	InputScoreTool input;
	DeleteScoreTool delete;
	ComputeAverageScoreTool average;
	SingGame(){
		average= new ComputeAverageScoreTool();
		delete = new DeleteScoreTool(average);
		input = new InputScoreTool(delete);
	}
	public void go(){
		input.inputScore();
	}
	public static void main(String[] args) {
		SingGame sg = new SingGame();
		sg.go();
	}

}

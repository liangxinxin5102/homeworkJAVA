package homeWork_6_7;

public class ComputeAverageScoreTool {

	public void computeAverageScore(double[] b) {
		double sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum = sum + b[i];
		}
		System.out.println("ѡ�����÷֣�" + sum / b.length);
	}
}

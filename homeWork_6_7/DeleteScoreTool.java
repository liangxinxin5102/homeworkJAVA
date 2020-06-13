package homeWork_6_7;

public class DeleteScoreTool {
	ComputeAverageScoreTool computeAverageScoreTool;
	DeleteScoreTool(	ComputeAverageScoreTool computeAverageScoreTool){
		this.computeAverageScoreTool = computeAverageScoreTool;
	}
	public void deleteScore(double[] a) {
		java.util.Arrays.parallelSort(a);
		System.out.println("ȥ��һ����߷�"+ a[a.length-1]);
		System.out.println("ȥ��һ����ͷ�"+a[0]);
		double b[] = new double[a.length-2];
		for(int i=1;i<a.length-1;i++) {
			b[i-1]=a[i];
		}
		
		computeAverageScoreTool.computeAverageScore(b);
	}
}

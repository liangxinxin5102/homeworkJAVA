package homeWork_6;


public class ComputeAverageScore {
    public void myComputeAverageScore(double[] b) {
        double sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i];
        }
        System.out.println("平均数为" + sum / b.length);
    }
}

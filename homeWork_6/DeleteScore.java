package homeWork_6;

public class DeleteScore {
    public double[] deleteScore(double[] a) {
        java.util.Arrays.parallelSort(a);
        System.out.println("去掉的最高分为"+ a[a.length-1]);
        System.out.println("去掉的最低分为"+a[0]);
        double b[] = new double[a.length-2];
        for(int i=1;i<a.length-1;i++) {
            b[i-1]=a[i];
        }
        return b;
    }
}

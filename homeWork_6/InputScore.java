package homeWork_6;
import java.util.Scanner; //键盘bai扫描类
public class InputScore {
    Scanner in = new Scanner(System.in);
    public double[] myScore(){
        System.out.println("请输入评委人数：");
        int count = in.nextInt();
        System.out.println("请输入分数");
        double a[]  = new double[count];
        for (int i=0;i<count;i++){
            a[i] = in.nextDouble();
        }
        return a;
    }
}

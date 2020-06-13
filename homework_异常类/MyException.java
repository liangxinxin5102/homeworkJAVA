package homework_异常类;

public class MyException extends Exception {
    public MyException(String ErrorMessagr) { // 构造方法
        super(ErrorMessagr); // 父类构造方法
    }

    public static void throwExpection(){
        throw new UnsupportedOperationException("方法尚未实现");
    }
    public static void rightExpection(int myCount){
        System.out.println("此条语句执行成功"+myCount);
    }

    public static void main(String[] args) {
        try {
            rightExpection(1);
            throwExpection();
            rightExpection(3);
        }
        catch (Exception ex1){
            System.out.println("已经捕获到异常ex1，执行此条语句");
        }
        rightExpection(4);

    }
}

package homework_回放写程序2;

interface Strategy{
    String approach(String msg, String y);
}


class MyClass{//Method Reference
    String myMethod(String  msg1,String msg2) {//instance method     class method
        return msg1.concat("三峡职业技术学院").concat(msg2);
    }
}

public class Strategize {
    Strategy strategy;//member1
    String msg1;//member2、
    String msg2;

    Strategize(String msgArg1,String msgArg2){
        this.msg1 = msgArg1;
        this.msg2 = msgArg2;
    }

    void setStrategy(Strategy strategyArg) {//change
        this.strategy = strategyArg;
    }

    void view() {
        System.out.println(this.strategy.approach(msg1,msg2));//dynamic banding
    }

    public static void main(String[] args) {
        Strategize s1 = new Strategize("三峡大学","土木工程学院");

        s1.setStrategy(
                (str1,str2) ->  {
                    return str1.substring(0,2)+str2.substring(0,4);
                });
        //new strategy lambda expression
        s1.view();
        //MyClass mc = new MyClass();
        s1.setStrategy(new MyClass()::myMethod);
        s1.view();
    }
}

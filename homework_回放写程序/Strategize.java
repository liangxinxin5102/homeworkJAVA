package homework_回放写程序;

interface Strategy{
    String approach(String msg);
}

class Soft implements Strategy{
    @Override
    public String approach(String msg){
        return msg.toLowerCase()+" soft's approach() was invoked!";//并置符号
    }
}
class Hard implements Strategy{
    @Override
    public String approach(String msg){
        return msg.toUpperCase()+" hard's approach() was incoked!";
    }
}
public class Strategize {
    Strategy strategy;//member1
    String msg;//member2
    Strategize(String msgArg){
        this.msg = msgArg;
        this.strategy = new Soft();
    }
    void setStrategy(Strategy strategyArg){
        this.strategy = strategyArg;
    }

    void view(){
        System.out.println(this.strategy.approach(msg));
    }

    public static void main(String[] args) {
        Strategize s1 = new Strategize("Ctgu");
        s1.view();
        s1.setStrategy(new Hard());
        s1.view();

        s1.setStrategy(new Strategy() {
            @Override
            public String approach(String msg) {
                return msg.substring(0,1);
            }
        });
        s1.view();

        s1.setStrategy(msg -> msg.substring(0,2));//new strategy
        s1.view();

        s1.setStrategy(msg -> msg.toUpperCase()+" soft's approach() was invoked!");
    }
}

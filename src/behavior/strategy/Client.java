package behavior.strategy;

public class Client {
    public static void main(String[] args) {
        //春节来了，采用策略A
        Strategy strategy=new StrategyA();
        Context salesMan=new Context(strategy);
        salesMan.salesManShow();

        //中秋节来了
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();

        //圣诞节来了
        salesMan=new Context(new StrategyC());
        salesMan.salesManShow();
    }
}



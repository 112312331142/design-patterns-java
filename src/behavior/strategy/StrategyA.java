package behavior.strategy;

//具体的策略类
public class StrategyA implements Strategy {

    @Override
    public void show() {
        System.out.println("买一送一");
    }
}

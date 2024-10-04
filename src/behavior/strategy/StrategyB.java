package behavior.strategy;

//具体的策略类
public class StrategyB implements Strategy {

    @Override
    public void show() {
        System.out.println("满二百减五十");
    }
}

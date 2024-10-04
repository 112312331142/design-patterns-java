package behavior.strategy;

//促销员（环境类）
public class Context {

    //聚合策略类对象
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //促销员展示促销活动
    public void salesManShow(){
        strategy.show();
    }
}

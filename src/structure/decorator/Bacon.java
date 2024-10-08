package structure.decorator;

//培根类（具体的装饰者角色）
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(3,"培根",fastFood);
    }

    @Override
    public float cost() {
        //计算价格
        return getPrice()+ getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}

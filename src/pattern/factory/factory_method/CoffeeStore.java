package pattern.factory.factory_method;

public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    //获取咖啡
    public Coffee getCoffee() {
        Coffee coffee = factory.makeCoffee();
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

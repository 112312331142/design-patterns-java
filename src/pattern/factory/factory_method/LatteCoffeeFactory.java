package pattern.factory.factory_method;

//拿铁咖啡工厂，专门用来生产拿铁咖啡
public class LatteCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee makeCoffee() {
        return new LatteCoffee();
    }
}

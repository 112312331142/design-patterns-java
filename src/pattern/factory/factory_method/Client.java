package pattern.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        //创建工厂对象
        AmericanCoffeeFactory factory = new AmericanCoffeeFactory();
        coffeeStore.setFactory(factory);
        //点咖啡
        Coffee coffee = coffeeStore.getCoffee();

        System.out.println(coffee.getName());
    }
}

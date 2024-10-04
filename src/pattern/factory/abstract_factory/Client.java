package pattern.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        //引用意大利风格甜品工厂对象
//        ItalyDessertFactory factory=new ItalyDessertFactory();
        AmericanDessertFactory factory=new AmericanDessertFactory();
        //获取对应的拿铁咖啡和提拉米苏产品
        Coffee coffee=factory.createCoffee();
        Dessert dessert=factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }

}

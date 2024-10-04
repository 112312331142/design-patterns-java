package pattern.builder.demo1;

public class Client {
    public static void main(String[] args) {
        //创建指挥者对象
//         Director director=new Director(new MobileBuilder());
        Director director=new Director(new OfoBuilder());
        //指挥者装配自行车
        Bike bike = director.constructor();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}

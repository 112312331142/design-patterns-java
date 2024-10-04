package pattern.builder.demo1;


/**
 * 指挥者类
 */
public class Director {

    //声明Builder类型的变量
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //组装自行车的方法
    public Bike constructor(){
        builder.builderFrame();
        builder.builderSeat();
        return builder.createBike();
    }
}

package pattern.builder.demo1;

public abstract class Builder {
    //声明Bike类型的变量，并进行赋值
    protected Bike bike=new Bike();

    public abstract void builderFrame();

    public abstract void builderSeat();

    //构建自行车的方法
    public abstract Bike createBike();
}

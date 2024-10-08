package pattern.builder.demo1;

/**
 * 具体的构建者，用来构建摩拜车对象
 */
public class MobileBuilder extends Builder {
    @Override
    public void builderFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

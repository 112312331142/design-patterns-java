package pattern.builder.demo1;

/**
 * Ofo单车构建者，用来构建ofo单车
 */
public class OfoBuilder extends Builder {
    @Override
    public void builderFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

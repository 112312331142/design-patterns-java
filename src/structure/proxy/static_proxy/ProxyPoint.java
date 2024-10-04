package structure.proxy.static_proxy;

/**
 * 代售点类
 */
public class ProxyPoint implements ShellTickets{

    //生命火车站类对象
    TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点代理火车票");
        trainStation.sell();
    }
}

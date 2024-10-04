package structure.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        TrainStation trainStation = new TrainStation();
        ProxyPoint proxyPoint=new ProxyPoint();

        trainStation.sell();
        proxyPoint.sell();
    }
}

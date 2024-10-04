package structure.proxy.static_proxy;

//火车站类
public class TrainStation implements ShellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}

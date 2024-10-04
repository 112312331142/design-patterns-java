package structure.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //1，创建代理工厂对象
        ProxyFactory factory=new ProxyFactory();
        //2.使用工厂对象的方法获取代理对象
        ShellTickets proxyObject = factory.getProxyObject();
        //3.调用卖电脑的方法
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        //让我们的程序一直执行
        while (true){

        }
    }
}

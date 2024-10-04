package behavior.Command;

public class Client {
    public static void main(String[] args) {
        //创建用两个个订单对象
        Order order1 = new Order();
        Order order2 = new Order();

        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面",1);
        order1.setFood("小杯可乐",2);


        order2.setDiningTable(12);
        order2.setFood("鸡蛋炒饭",2);
        order2.setFood("蜜雪冰城",4);

        //创建厨师对象
        SeniorChef receiver = new SeniorChef();
        //创建命令对象
        OrderCommand cmd1=new OrderCommand(receiver,order1);
        OrderCommand cmd2=new OrderCommand(receiver,order2);

        //创建调用者(服务员对象)
        Waiter invoke=new Waiter();
        invoke.setCommands(cmd1);
        invoke.setCommands(cmd2);

        //让服务器发起命令
        invoke.orderUp();

    }
}

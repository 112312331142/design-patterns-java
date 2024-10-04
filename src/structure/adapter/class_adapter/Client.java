package structure.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        //读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("=============================");
        //使用该计算机读取TF卡中的数据
        //定义适配器类
        SDAdapterTF adapter = new SDAdapterTF();
        String msg2 = computer.readSD(adapter);
        System.out.println(msg2);
    }
}

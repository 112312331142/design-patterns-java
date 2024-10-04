package structure.flyweight;

public class Client {
    public static void main(String[] args) {
        //获取I图形对象
        AbstractBox box1 = BoxFactory.getInstance().getShape("IBox");
        box1.display("grey");

        //获取L图形对象
        AbstractBox box2 = BoxFactory.getInstance().getShape("LBox");
        box2.display("pink");

        //获取O图形对象
        AbstractBox box3 = BoxFactory.getInstance().getShape("OBox");
        box3.display("red");
//        System.out.println(box3);

        AbstractBox box4 = BoxFactory.getInstance().getShape("OBox");
        box3.display("yellow");

        System.out.println("两次获取到的o图形对象是否是同一个对象：" + (box3 == box4));
    }
}

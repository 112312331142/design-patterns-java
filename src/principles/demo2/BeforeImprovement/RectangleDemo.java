package principles.demo2.BeforeImprovement;

public class RectangleDemo {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle rectangle = new Rectangle();
        //设置长和宽
        rectangle.setWidth(10);
        rectangle.setLength(20);
        //调用resize方法
        resize(rectangle);
        //调用打印方法
        print(rectangle);

        System.out.println("=====================");
        //创建正方形对象
        Square square = new Square();
        //设置长和宽
        square.setWidth(10);
        //调用resize方法
        resize(square);
        //调用打印方法
        print(square);
    }

    //扩宽方法
    public static void resize(Rectangle r) {
        //判断宽比长小，进行扩宽操作
        while(r.getLength()>= r.getWidth()){
            r.setWidth(r.getWidth()+1);
        }
    }

    //打印长宽
    public static void print(Rectangle r) {
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
    }
}

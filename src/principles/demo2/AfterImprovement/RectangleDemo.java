package principles.demo2.AfterImprovement;

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
//
//        System.out.println("=====================");
//        //创建正方形对象
//        Square square = new Square();
//        //设置长和宽
//        square.setSide(10);
//        //调用resize方法
//        resize(square);
//        //调用打印方法
////        print
    }

    //扩宽方法
    public static void resize(Rectangle r) {
        //判断宽比长小，进行扩宽操作
        while(r.getLength()>= r.getWidth()){
            r.setWidth(r.getWidth()+1);
        }
    }

    //打印长和宽
    public static void print(Quadrilateral quadrilateral){
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}

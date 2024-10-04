package pattern.prototype.test;

import java.io.*;

public class CitationTest1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Citation citation=new Citation();
        Student student=new Student();
        student.setName("张三");
        citation.setStu(student);

        //创建对象输出流
        ObjectOutputStream oos=new ObjectOutputStream(
                new FileOutputStream("D:\\Java\\javawenjian\\design_patterns\\a.txt"));
        //写对象
        oos.writeObject(citation);
        //释放资源
        oos.close();

        //读取对象
        //创建对象输入流对象
        ObjectInputStream ois=new ObjectInputStream(
                new FileInputStream("D:\\Java\\javawenjian\\design_patterns\\a.txt"));
        //读对象
        Citation citation1 = (Citation) ois.readObject();
        //释放资源
        ois.close();

        citation1.getStu().setName("高鑫");

        citation.show();
        citation1.show();
    }
}

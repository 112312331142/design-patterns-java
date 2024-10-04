package pattern.singleton.demo7;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writeObjectToFile();
        readObjectFromFile();
        readObjectFromFile();
    }

    //向文件中写数据（数据）
    public static void writeObjectToFile() throws IOException {
        //获取Singleton对象
        Singleton singleton = Singleton.getInstance();
        //创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\Java\\javawenjian\\design_patterns\\a.txt"));
        //写对象
        oos.writeObject(singleton);
        //释放资源
        oos.close();
    }

    //从文件中读数据（对象）
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        //创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("D:\\Java\\javawenjian\\design_patterns\\a.txt"));
        //读取对象
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        ois.close();
    }
}

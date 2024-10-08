package pattern.singleton.demo8;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException
            , NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        //1.获取singleton的字节码对象
        Class clazz=Singleton.class;
        //2.获取无参构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();
        //3.取消访问检查
        cons.setAccessible(true);
        //4.创建对象通过反射方式
        Singleton s1 = (Singleton) cons.newInstance();
        Singleton s2 = (Singleton) cons.newInstance();

        System.out.println(s1==s2);
    }




}

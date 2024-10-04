package pattern.singleton.demo3;

public class Singleton {
    //私有构造方法
    private Singleton(){}
    //声明singleton类型的变量instance
    private static Singleton instance;
    //对外提供访问方式
    public static synchronized Singleton getInstance(){
        //判断instance是否为null，为null创建一个对象
        if(instance == null){
            //线程1等待
            instance = new Singleton();
        }
        return instance;
    }
}

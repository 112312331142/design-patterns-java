package pattern.singleton.demo4;

//双重检查锁方式
public class Singleton {
    private Singleton(){}

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        //第一次判断，如果instance不为nul，不需要抢占锁，直接返回对象
        if(instance == null){
            synchronized (Singleton.class){
                //第二次判断
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

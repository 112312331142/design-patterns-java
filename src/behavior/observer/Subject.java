package behavior.observer;

//抽象主题类
public interface Subject {

    //添加观察者对象对象
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知订阅者
    void notify(String message);
}

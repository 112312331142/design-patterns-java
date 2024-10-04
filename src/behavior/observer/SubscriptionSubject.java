package behavior.observer;

import java.util.ArrayList;
import java.util.List;

//具体主题角色类
public class SubscriptionSubject implements Subject{

    //定义一个集合用来存储多个观察者对象
    private List<Observer> wechatUserList = new ArrayList<Observer>();

    private String name;

    public SubscriptionSubject(String name) {
        this.name = name;
    }

    @Override
    public void attach(Observer observer) {
        wechatUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        wechatUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        //遍历集合
        for (Observer observer : wechatUserList) {
            System.out.println(name+"更新了");
            //调用观察者对象中的update方法
            observer.update(message);
        }
    }
}

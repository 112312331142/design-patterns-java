package behavior.observer;

public class Client {
    public static void main(String[] args) {
        //1.创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject("王者荣耀");
        //2.订阅公众号
        subject.attach(new WechatUser("高鑫"));
        subject.attach(new WechatUser("叶凡"));
        subject.attach(new WechatUser("石昊"));

        //3.公众号更新，发送消息给订阅者对象
        subject.notify("学java月薪过one");
    }
}

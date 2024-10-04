package structure.facade;

//外观类，用户主要和该类对象进行交互
public class SmartAppliancesFacade {

    //聚合电灯对象，电视对象，空调对象
    private Light light;
    private AirConditioner airConditioner;
    private  TV tv;

    public SmartAppliancesFacade() {
        light = new Light();
        airConditioner = new AirConditioner();
        tv = new TV();
    }

    //定义say方法,通过语音控制
    public void say(String message) {
        if(message.contains("open")){
            on();
        }else if(message.contains("close")){
            off();
        }else{
            System.out.println("我还听不懂你说的");
        }
    }

    //一键关闭
    private void off() {
        light.off();
        airConditioner.off();
        tv.off();
    }

    //一键打开
    private void on() {
        light.on();
        airConditioner.on();
        tv.on();
    }
}

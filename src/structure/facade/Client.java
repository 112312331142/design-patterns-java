package structure.facade;

public class Client {
    public static void main(String[] args) {
        //创建智能音箱对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //控制家电
        facade.say("open all");
        System.out.println("=======================");
        facade.say("close all");
        System.out.println("=======================");
        facade.say("shit bitch");
    }
}

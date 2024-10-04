package behavior.mediator;

public class Client {
    public static void main(String[] args) {
        //创建中介对象
        MediatorStructure mediator=new MediatorStructure();

        //创建租房者对象
        Tenant tenant=new Tenant("韩立",mediator);
        Tenant tenant1=new Tenant("王林",mediator);
        //创建房主对象
        HouseOwner houseOwner=new HouseOwner("萧诧",mediator);
        HouseOwner houseOwner1=new HouseOwner("司徒南",mediator);

        //中介者要知道具体的房主和租房者
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        tenant.contact("在下韩立，不值一提");
        houseOwner.contact("玄骨道人萧诧");

        mediator.setHouseOwner(houseOwner1);
//        mediator.setTenant(tenant1);

//        tenant1.contact("王某已跻身元婴境");
//        houseOwner1.contact("司徒南");

//        tenant.contact("在下韩立，不值一提");
        houseOwner.contact("玄骨道人萧诧");
    }
}

package principles.demo5;

public class Client {
    public static void main(String[] args) {
        //创建经纪人类
        Agent agent=new Agent();
        //创建明星对象
        Star star=new Star("蔡徐坤");
        agent.setStar(star);
        //创建粉丝对象
        Fans fans=new Fans("高鑫");
        agent.setFans(fans);
        //创建公司对象
        Company company=new Company("大大公司");
        agent.setCompany(company);

        //调用方法
        agent.meeting();
        agent.conservation();
    }
}

package pattern.builder.demo2;

public class Client {
    public static void main(String[] args) {
        //创建手机对象 通过构建者对象获取手机对象
        Phone phone=new Phone.Builder()
                .cpu("intel").mainboard("华硕").screen("三星屏幕").memory("金士顿")
                .build();

        System.out.println(phone);
    }
}

package principles.demo1;

public class Client {
    public static void main(String[] args) {
        //1.创建搜狗输入法对象
        SougouInput si=new SougouInput();
        //2.创建皮肤对象
//        DefaultSkin sk=new DefaultSkin();
        ChenSkin sk=new ChenSkin();
        //3.将皮肤设置到输入法中
        si.setSkin(sk);

        //4.展示皮肤
        si.display();

    }
}

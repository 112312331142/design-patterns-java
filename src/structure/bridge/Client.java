package structure.bridge;

public class Client {
    public static void main(String[] args) {
        //创建Mac系统对象
        OperatingSystem system=new Mac(new AVIFile());
        //使用操作系统播放视频文件
        system.play("战狼2");
    }
}

package structure.bridge;

//avi视频文件（具体的是鲜花角色）
public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("AVI视频文件："+fileName);
    }
}

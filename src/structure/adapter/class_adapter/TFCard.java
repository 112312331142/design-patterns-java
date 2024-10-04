package structure.adapter.class_adapter;

//适配者类的接口
public interface TFCard {

    //从TF中读取数据
    String readTF();
    //从TF中写数据
    void writeTF(String msg);
}

package structure.adapter.class_adapter;

//适配者类
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TECard read msg: hello world TFCard";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TECard write msg: " + msg);
    }
}

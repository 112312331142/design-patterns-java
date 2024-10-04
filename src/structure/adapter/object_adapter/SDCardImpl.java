package structure.adapter.object_adapter;

//具体的SD卡
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "SDCard read msg: hello world SD";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg: " + msg);
    }
}

package structure.flyweight;

import java.util.HashMap;

//工厂类，将该类设计为单例
public class BoxFactory {

    private final HashMap<String,AbstractBox> map;

    //在构造方法中进行初始化操作
    private BoxFactory() {
        map = new HashMap<>();
        map.put("IBox",new IBox());
        map.put("LBox",new LBox());
        map.put("OBox",new OBox());
    }

    //提供一个方法获取该工厂类
    public static BoxFactory getInstance() {
        return factory;
    }

    private static final BoxFactory factory = new BoxFactory();

    //根据名称获取图形对象
    public AbstractBox getShape(String name){
        return map.get(name);
    }
}

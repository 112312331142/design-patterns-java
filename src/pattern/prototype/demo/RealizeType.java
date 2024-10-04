package pattern.prototype.demo;

import java.util.ResourceBundle;

public class RealizeType implements Cloneable{

    public RealizeType() {
        System.out.println("具体的原型对象创建完成");
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (RealizeType) super.clone();
    }
}

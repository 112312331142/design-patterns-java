package structure.flyweight;

//O图形类（具体享元角色）
public class OBox extends AbstractBox{
    @Override
    public String getShape() {
        return "OBox";
    }
}

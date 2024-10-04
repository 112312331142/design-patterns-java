package structure.decorator;

//炒面类（具体构建角色）
public class FriedNoodles extends FastFood {

    FriedNoodles(){
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}

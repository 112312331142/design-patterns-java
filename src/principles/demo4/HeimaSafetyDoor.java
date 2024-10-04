package principles.demo4;

public class HeimaSafetyDoor implements AntiTheft,FireProof,WaterProof{
    @Override
    public void antiTheft() {
        System.out.println("antiTheft");
    }

    @Override
    public void fireProof() {
        System.out.println("fireProof");
    }

    @Override
    public void waterProof() {
        System.out.println("waterProof");
    }
}

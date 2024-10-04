package principles.demo3.BeforeImprovement;

public class ComputerDemo {
    public static void main(String[] args) {
        //创建组件对象
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();
        KingstonMemory kingstonMemory = new KingstonMemory();
        IntelCPU intelCPU = new IntelCPU();
        //创建计算机对象
        Computer computer = new Computer();
        computer.setCpu(intelCPU);
        //组装计算机
        computer.setMemory(kingstonMemory);
        computer.setHardDIsk(xiJieHardDisk);
        //启动计算机
        computer.run();
    }
}

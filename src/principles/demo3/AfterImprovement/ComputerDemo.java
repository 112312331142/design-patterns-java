package principles.demo3.AfterImprovement;

public class ComputerDemo {
    public static void main(String[] args) {
        //创建组件对象
        HardDisk hardDisk=new XiJieHardDisk();
        Cpu cpu=new IntelCPU();
        Memory memory=new KingstonMemory();
        //创建计算机对象
        Computer computer = new Computer();
        //组装计算机
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.setHardDisk(hardDisk);
        //启动计算机
        computer.run();
    }
}

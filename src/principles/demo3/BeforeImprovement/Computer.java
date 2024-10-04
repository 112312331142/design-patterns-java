package principles.demo3.BeforeImprovement;

public class Computer {

    private XiJieHardDisk hardDisk;
    private IntelCPU cpu;
    private KingstonMemory memory;

    public XiJieHardDisk getHardDIsk() {
        return hardDisk;
    }

    public void setHardDIsk(XiJieHardDisk hardDIsk) {
        this.hardDisk = hardDIsk;
    }

    public IntelCPU getCpu() {
        return cpu;
    }

    public void setCpu(IntelCPU cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void run(){
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("从硬盘上获取的数据："+data);
        cpu.run();
        memory.save();
    }
}

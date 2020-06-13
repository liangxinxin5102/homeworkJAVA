package homeWork_4;

public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        HardDisk disk = new HardDisk();
        cpu.speed = 2200;
        disk.amount = 200;

        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}

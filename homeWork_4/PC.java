package homeWork_4;

public class PC {
    public CPU cpu;
    public HardDisk HD;
    public void setCPU(CPU c){
        this.cpu = c;
    }
    public void setHardDisk(HardDisk h){
        this.HD = h;
    }
    public void show(){
        System.out.println("CPU的速度为:"+cpu.speed);
        System.out.println("CPU的硬盘容量为:"+HD.amount);
    }
}

package homework_子类与继承;

public class Simulator {
    public void playSound(Animal animal){
        System.out.println("对象的名字是："+animal.getAnimalName());
        System.out.println("对象的声音是："+animal.cry());
    }
}

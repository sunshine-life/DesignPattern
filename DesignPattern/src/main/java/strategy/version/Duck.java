package strategy.version;


public abstract class Duck {
    public void say(){
        System.out.println("鸭子嘎嘎叫");
    }
    public void swim(){
        System.out.println("鸭子都会游泳");
    }
    //子类实现外观
    public abstract void show();
}
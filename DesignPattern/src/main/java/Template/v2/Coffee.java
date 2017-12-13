package Template.v2;

/**
 * Created by life on 17-4-17.
 */
public class Coffee extends DrinkTemplate {
    @Override
    protected void addCondiments() {
        System.out.println("加入牛奶与咖啡");
    }

    @Override
    protected void brew() {
        System.out.println("用开水冲泡咖啡");
    }

    @Override
    public void putInCup() {
        System.out.println("将咖啡倒入杯中");
    }
}

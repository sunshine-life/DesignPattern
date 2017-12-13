package Template.v2;

/**
 * Created by life on 17-4-17.
 * 制备饮料的模板方法
 * １．将水煮沸
 * ２．用沸水冲泡饮料（可变）
 * ３．加入调料（可变）
 * ４．将饮料倒入杯中
 *
 * putInCup与getHotWater两个都是固定方法，但是getHotWater是private权限，避免了子类去重写修改
 *
 */

public abstract class DrinkTemplate {
    public final void productDrinkTmeplate(){
        //１．将水煮沸
        getHotWater();
        //２．用沸水冲泡饮料（可变）
        brew();
        //３．加入调料（可变），现在调料可根据客户的需求选择添加或者不填加
        if(isAdd()){
            addCondiments();
        }
        //４．将饮料倒入杯中
        putInCup();
    }

    /**
     * Ｈook,钩子函数，提供一个默认的或者空的实现
     * 具体的子类可以自行决定是否挂钩以及如何挂钩
     * 判断用户是否添加调料
     * @return
     */
    protected boolean isAdd() {
        return true;
    }

    public void putInCup() {
        System.out.println("将饮料倒入杯中");
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void getHotWater() {
        System.out.println("将开水煮沸");
    }

}

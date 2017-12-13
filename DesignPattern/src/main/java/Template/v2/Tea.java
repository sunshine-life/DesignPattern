package Template.v2;

/**
 * Created by life on 17-4-17.
 */
public class Tea extends DrinkTemplate {
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    @Override
    protected void brew() {
        System.out.println("用８０度的水冲泡茶");
    }

    //子类选择重写的形式来选择与父类挂钩
    @Override
    protected boolean isAdd() {
        System.out.println("不加入柠檬");
        return false;
    }
}

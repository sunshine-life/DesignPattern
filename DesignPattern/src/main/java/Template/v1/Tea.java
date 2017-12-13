package Template.v1;

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
}

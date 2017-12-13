package proxy.jdk;

/**
 * Created by life on 17-5-25.
 */
public class Car implements Movieable{
    @Override
    public boolean run() {
        System.out.println("小车开始行驶");
        return true;
    }
}

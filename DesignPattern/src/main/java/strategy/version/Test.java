package strategy.version;

/**
 * Created by life on 17-3-23.
 */
public class Test {
    public static void main(String[] args) {
        Duck red = new RedDuck();
        red.say();
        red.swim();
        red.show();
        Duck white = new WhiteDuck();
        white.say();
        white.swim();
        white.show();
    }
}

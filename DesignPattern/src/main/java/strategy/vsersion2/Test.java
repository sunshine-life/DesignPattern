package strategy.vsersion2;

import strategy.vsersion2.SayBehavior.SayGaGa;
import strategy.vsersion2.SayBehavior.SayGeGe;
import strategy.vsersion2.SiwmBehavior.BadSwim;
import strategy.vsersion2.SiwmBehavior.GoodSiwm;

/**
 * Created by life on 17-3-23.
 */
public class Test {
    public static void main(String[] args) {
        Duck red = new RedDuck(new SayGaGa(),new GoodSiwm());
        Duck white = new WhiteDuck(new SayGeGe(),new BadSwim());
        red.say();
        red.swim();
        white.say();
        white.swim();

    }
}

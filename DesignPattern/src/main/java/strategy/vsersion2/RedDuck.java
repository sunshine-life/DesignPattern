package strategy.vsersion2;


import strategy.vsersion2.SayBehavior.SayBehavior;
import strategy.vsersion2.SiwmBehavior.SwimBehavior;

public class RedDuck extends Duck {
    public RedDuck(SayBehavior say, SwimBehavior siwm) {
        super(say,siwm);
    }
}

package strategy.vsersion2;

import strategy.vsersion2.SayBehavior.SayBehavior;
import strategy.vsersion2.SiwmBehavior.SwimBehavior;

/**
 * Created by life on 17-3-23.
 */
public class WhiteDuck extends Duck {
    public WhiteDuck(SayBehavior say, SwimBehavior siwm) {
        super(say,siwm);
    }
}

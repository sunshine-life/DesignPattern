package strategy.vsersion2;

import strategy.vsersion2.SayBehavior.SayBehavior;
import strategy.vsersion2.SiwmBehavior.SwimBehavior;

/**
 * Created by life on 17-3-23.
 */
public abstract class Duck {

    public Duck(){}

    public Duck(SayBehavior say, SwimBehavior swim){
        this.say = say;
        this.swim = swim;

    }

    SayBehavior say;
    SwimBehavior swim;


    public void say(){
        say.say();
    }
    public void swim(){
        swim.swim();
    }
}

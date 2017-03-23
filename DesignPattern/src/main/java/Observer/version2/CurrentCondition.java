package Observer.version2;

/**
 * Created by life on 17-3-23.
 */
public class CurrentCondition extends Conditon  {


    public void show(){
        System.out.println("当前湿度"+this.c_temperature);
        System.out.println("当前温度"+this.c_humidity);
    }
}

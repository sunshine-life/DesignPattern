package Observer.version2;

/**
 * m明天的气象预告版，模拟多个观察者
 */
public class TomorrowCondition extends Conditon  {

    public void show(){
        System.out.println("明天湿度"+this.c_temperature+"加一度");
        System.out.println("明天温度"+this.c_humidity+"加10cc");
    }
}

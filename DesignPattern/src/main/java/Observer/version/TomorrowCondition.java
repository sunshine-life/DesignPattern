package Observer.version;

/**
 * Created by life on 17-3-23.
 */
public class TomorrowCondition {
    public String c_temperature;
    public String c_humidity;

    public void update(String c_temperature,String c_humidity){
        this.c_humidity = c_humidity;
        this.c_temperature = c_temperature;
        show();
    }

    public void show(){
        System.out.println("明天湿度"+this.c_temperature+"加一度");
        System.out.println("明天温度"+this.c_humidity+"加10cc");
    }
}

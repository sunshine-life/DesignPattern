package Observer.version;

/**
 * 气象公告版
 */
public class CurrentCondition {
    public String c_temperature;
    public String c_humidity;

    public void update(String c_temperature,String c_humidity){
        this.c_humidity = c_humidity;
        this.c_temperature = c_temperature;
        show();
    }

    public void show(){
        System.out.println("当前湿度"+this.c_temperature);
        System.out.println("当前温度"+this.c_humidity);

    }
}

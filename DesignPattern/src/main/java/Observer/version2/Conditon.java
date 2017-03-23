package Observer.version2;

/**
 * Created by life on 17-3-23.
 */
public abstract class Conditon implements Observer {
    public String c_temperature;
    public String c_humidity;

    public void update(String c_temperature,String c_humidity){
        this.c_humidity = c_humidity;
        this.c_temperature = c_temperature;
        show();
    }

    public abstract void show();
}

package Observer.version2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by life on 17-3-23.
 */
public class WertherData implements Subject {
    public String temperature;//温度
    public String humidity; //湿度
    public List<Observer> list;//注册气象显示的公告版


    WertherData(){
        list = new ArrayList<Observer>();
    }


    public void setData(String c_temperature,String c_humidity){
        temperature = c_temperature;
        humidity = c_humidity;
        notify(list);
    }

    @Override
    public void registObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notify(List<Observer> list) {
        for(Observer observer:list){
            observer.update(this.temperature,this.humidity);
        }
    }
}

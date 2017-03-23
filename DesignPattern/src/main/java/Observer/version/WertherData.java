package Observer.version;

/**
 * Created by life on 17-3-23.
 */
public class WertherData {
    public String temperature;//温度
    public String humidity; //湿度

    public CurrentCondition cu;//气象显示的公告版
    public TomorrowCondition cu2;//明天气象显示的公告版


    public WertherData(CurrentCondition cu,TomorrowCondition cu2){
        this.cu = cu;
        this.cu2 = cu2;
    }


    public void changeWerther(){
        this.cu.update(temperature,humidity);
        this.cu2.update(temperature,humidity);
    }
    public void setData(String c_temperature,String c_humidity){
        temperature = c_temperature;
        humidity = c_humidity;
        changeWerther();
    }

}

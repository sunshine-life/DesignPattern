package Observer.version2;

import java.util.List;

/**
 * Created by life on 17-3-23.
 */
public interface Subject {

    public void registObserver(Observer o);//注册观察者
    public void removeObserver(Observer o);//移除观察者
    public void notify(List<Observer> list);//通知观察者更新信息

}

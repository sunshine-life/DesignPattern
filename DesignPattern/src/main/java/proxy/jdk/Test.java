package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by life on 17-5-25.
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler inv = new CarProxy(car);

        /**
         * loader  类加载器
         * interface  实现接口
         * InvocationHandler  创建的代理对象
         */
        Movieable movieable = (Movieable) Proxy.newProxyInstance(car.getClass().getClassLoader(),car.getClass().getInterfaces(),inv);
        movieable.run();
    }
}

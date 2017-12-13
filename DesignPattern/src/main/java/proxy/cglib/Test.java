package proxy.cglib;

/**
 * Created by life on 17-5-25.
 */
public class Test {
    public static void main(String[] args) {

        CarProxy pro = new CarProxy();
        Car car = (Car) pro.getProxy(Car.class);
        car.run();

    }
}

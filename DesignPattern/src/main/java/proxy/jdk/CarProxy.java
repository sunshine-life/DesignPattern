package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by life on 17-5-25.
 */
public class CarProxy implements InvocationHandler {

    private Object object;

    CarProxy(Object object){
        super();
        this.object = object;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("找了个代驾");
        Object get = method.invoke(object);
        System.out.println("安全到家");
        return get;
    }
}

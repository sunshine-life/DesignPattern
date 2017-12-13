package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by life on 17-5-25.
 */
public class CarProxy implements MethodInterceptor {


    private Enhancer enhancer = new Enhancer();

    /**
     * 创建目标对象的代理类
     * @param clazz
     * @return
     */
    public Object getProxy(Class clazz){
        //cglib的代理是创建代理对象的子类对象，所以先设置需要创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     *  拦截所有目标方法的调用
     * @param o    目标类的实例
     * @param method   目标方法的反射对象
     * @param objects   方法参数
     * @param methodProxy   代理对象的实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("找了个代驾");
        Object get = methodProxy.invokeSuper(o,objects);
        System.out.println("安全到家");
        return get;
    }
}

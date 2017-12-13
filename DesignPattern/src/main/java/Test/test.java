package Test;

import WechatRedpaper.RedFactory;

import java.lang.reflect.Method;

/**
 * Created by life on 17-5-23.
 */
public class test {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            lab:
            for(int j=0;j<5;j++){
                if(j==2){
                    break lab;
                }
                System.out.println("i="+i+";j="+j);
            }
        }


        try {
            Class c = Class.forName("WechatRedpaper.RedFactory");
            Method[] methods = c.getDeclaredMethods();
            System.out.println(methods.length);
            RedFactory redFactory = (RedFactory)c.newInstance();
            System.out.println(redFactory);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}

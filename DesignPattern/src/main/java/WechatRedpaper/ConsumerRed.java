package WechatRedpaper;

/**
 * Created by life on 17-5-15.
 */
public class ConsumerRed implements Runnable {

    public RedFactory rf;

    ConsumerRed(RedFactory rf){
        this.rf = rf;
    }

    @Override
    public void run() {
        rf.getRed("第一个红包");
    }
}

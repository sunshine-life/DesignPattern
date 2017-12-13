package WechatRedpaper;

/**
 * Created by life on 17-5-15.
 */
public class PruductRed implements Runnable {

    public RedFactory rf;

    PruductRed(RedFactory rf){
        this.rf = rf;
    }

    @Override
    public void run() {
        try {
            rf.initRedPaper("第一个红包",100,10);

            rf.initRedPaper("第一个红包",1000,10);
        } catch (InterruptedException e) {
            System.out.println("红包出错");
        }
    }
}

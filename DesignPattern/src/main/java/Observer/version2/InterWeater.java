package Observer.version2;

/**
 * Created by life on 17-3-23.
 */
public class InterWeater {

    public static void main(String[] args) {
        CurrentCondition cu = new CurrentCondition();
        TomorrowCondition cu1 = new TomorrowCondition();



        WertherData wd = new WertherData();
        wd.registObserver(cu);
        wd.registObserver(cu1);

        wd.setData("30度","40cc");
        wd.removeObserver(cu1);
        wd.setData("60度","80cc");

    }

}

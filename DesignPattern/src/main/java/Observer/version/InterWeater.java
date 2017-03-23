package Observer.version;

/**
 * Created by life on 17-3-23.
 */
public class InterWeater {
    public static void main(String[] args) {
        CurrentCondition cu = new CurrentCondition();
        TomorrowCondition cu2 = new TomorrowCondition();
        WertherData wd = new WertherData(cu,cu2);
        wd.setData("30度","40cc");
        wd.setData("60度","80cc");

    }
}

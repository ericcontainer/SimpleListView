package studio.container.com.anotherlistview;

/**
 * Created by Eric on 28/02/2017.
 */

public class Palavra {


    public Palavra(String tv1, String tv2, String tv3) {
        this.setTv1(tv1);
        this.setTv2(tv2);
        this.setTv3(tv3);
    }

    private String tv1;
    private String tv2;
    private String tv3;


    public String getTv1() {
        return tv1;
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    public String getTv2() {
        return tv2;
    }

    public void setTv2(String tv2) {
        this.tv2 = tv2;
    }

    public String getTv3() {
        return tv3;
    }

    public void setTv3(String tv3) {
        this.tv3 = tv3;
    }


}

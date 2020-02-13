package paint.com.itsp;

public class Figura {
    Integer xi;
    Integer yi;
    Integer xf;
    Integer yf;

    public Figura(Integer xi, Integer yi, Integer xf, Integer yf) {
        this.xi = xi;
        this.yi = yi;
        this.xf = xf;
        this.yf = yf;
    }

    public Integer getXi() {
        return xi;
    }

    public void setXi(Integer xi) {
        this.xi = xi;
    }

    public Integer getYi() {
        return yi;
    }

    public void setYi(Integer yi) {
        this.yi = yi;
    }

    public Integer getXf() {
        return xf;
    }

    public void setXf(Integer xf) {
        this.xf = xf;
    }

    public Integer getYf() {
        return yf;
    }

    public void setYf(Integer yf) {
        this.yf = yf;
    }
}

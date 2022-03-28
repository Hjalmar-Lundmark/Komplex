public class Komplex {
    double re;
    double im;

    public Komplex(double RE, double IM) {
        re = RE;
        im = IM;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }


    public Komplex add(Komplex b) {
        return b;
    }
}

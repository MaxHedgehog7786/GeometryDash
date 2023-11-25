public class Circle extends GeometryObject{
    double r;

    public Circle(double r) {
        super();
        this.r = r;
    }

    @Override
    double getSquare() {
        return  Math.PI*r*r;
    }

    @Override
    void setScale(double q) {
        this.r*=q;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}

public class Rectangle extends GeometryObject{
    double a,b;

    public Rectangle(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

    @Override
    double getSquare() {
        return a*b;
    }

    @Override
    void setScale(double q) {
        this.a*=q;
        this.b*=q;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

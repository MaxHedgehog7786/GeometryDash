public class Triangle extends GeometryObject{
    double a,b,c;

    public Triangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getSquare() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    void setScale(double q) {
        this.a*=q;
        this.b*=q;
        this.c*=q;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

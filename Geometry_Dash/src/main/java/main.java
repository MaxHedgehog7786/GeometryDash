import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        GeometryObject[] obj = new GeometryObject[]{new Triangle(3,4,5), new Rectangle(5,6), new Circle(4)};
        Arrays.sort(obj);
        System.out.println(Arrays.toString(obj));
        obj[0].setScale(3);
        Arrays.sort(obj);
        System.out.println(Arrays.toString(obj));


    }
}

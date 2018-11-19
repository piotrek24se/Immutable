package immutable;

public class SwapObject {

    public static void main(String[] args) {
        Point point = new Point(0, 1);

        System.out.println("Values before invoke swap method - " + point);
        swap(point);
        System.out.println("Values after invoke swap method - " + point);

    }

    private static void swap(Point point) {
        point = new Point(100, 100);
    }

}

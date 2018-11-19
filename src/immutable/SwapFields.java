package immutable;

public class SwapFields {

    public static void main(String[] args) {
        Point point = new Point(0, 1);

        System.out.println("Values before invoke swap method - " + point);
        swap(point);
        System.out.println("Values after invoke swap method - " + point);

        System.out.println(point);

    }

    private static void swap(final Point point) {
        int tmp;
        tmp = point.x;
        point.x = point.y;
        point.y = tmp;
    }

}

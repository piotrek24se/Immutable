package immutable;

public class SimpleSwap {

    public static void main(String[] args) {
        int x = 0;
        int y = 1;

        System.out.println("Values before invoke swap method - x: " + x + " y: " + y);
        swap(x, y);
        System.out.println("Values after invoke swap method - x: " + x + " y: " + y);
    }

    private static void swap(int a, int b) {
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
    }

}

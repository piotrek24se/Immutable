package longJump;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] ints = new int[]{478, 475, 470, 480, 481, 481, 475, 477, 480, 482, 470};

        // numberOfPositiveSessions
        // niedokonczone

        System.out.println(numberOfPositiveSessionsOver3(ints));
    }


    private static int numberOfPositiveSessionsOver3(int[] ints) {

        int currentIndex = 0;
        int positiveSessions = 0;
        int positiveSessionsOver3 = 0;

        while (ints[currentIndex + 1] >= ints[currentIndex]) {
            currentIndex++;
        }
        positiveSessions++;

        return 0;
    }

}

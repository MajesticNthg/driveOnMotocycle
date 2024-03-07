public class Level1 {
    public static int odometer(int[] oksana) {
        int allTime = 0;
        int time = 0;
        int distance = 0;
        int currentDistance = 0;

        for (int x = 0; x < oksana.length; x++) {
            if (x % 2 != 0) {
                time = oksana[x] - allTime;
                allTime = oksana[x];
                currentDistance = time * oksana[x - 1];
                distance += currentDistance;
            }
        }
        return distance;


    }
}



package intermideate;
import java.util.Random;

public class arraysapp {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int[] lotterynumbers = new int[5];
        lotterynumbers[0] = randomNumberGenerator.nextInt(98) + 1;
        lotterynumbers[1] = 23;
        lotterynumbers[2] = 123;
        lotterynumbers[3] = 21;
        lotterynumbers[4] = 21;

        for (int lotterynumber: lotterynumbers) {
            System.out.println(lotterynumber);
        }

        int[][] weeklylottery = {
                {1, 2, 3, 4, 5},
                {1, 2, 2, 3, 4},
                {3, 1, 4, 5, 12},
                {7, 2, 3, 8, 9}
        };

        for (int i =0; i < weeklylottery.length ; i++){
            for (int j=0; j < weeklylottery[i].length; j++){
                System.out.println(weeklylottery[i][j] + " ");
            }
            System.out.println();
        }
    }
}

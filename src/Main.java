import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        int[] positiveList = new int[intList.size()];
        int positiveCount = 0;
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0) {
                positiveList[positiveCount] = intList.get(i);
                positiveCount++;
            }
        }

        int[] evenList = new int[positiveCount];
        int evenCount = 0;
        for (int i = 0; i < positiveCount; i++) {
            if (positiveList[i] % 2 == 0) {
                evenList[evenCount] = positiveList[i];
                evenCount++;
            }
        }

        int[] orderList = new int[evenCount];
        for (int i = 0; i < evenCount; i++) {
            orderList[i] = evenList[i];
        }
        Arrays.sort(orderList);

        System.out.println(Arrays.toString(orderList));
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Testy {

    private static boolean[][] dp;

    private ArrayList<Object[]> allCombinations = new ArrayList<Object[]>();

    private void display(ArrayList<Integer> v, int size) {
        if(v.size() == size) {
            allCombinations.add(v.toArray());
//            System.out.println(v);
        }
    }

    private void printSubsetsRec(int[] arr, int i, int sum, ArrayList<Integer> p, int size) {
        if (i == 0 && sum != 0 && dp[0][sum]) {
            p.add(arr[i]);
            display(p, size);
            p.clear();
            return;
        } else if (i == 0 && sum == 0) {
            display(p, size);
            p.clear();
            return;
        }

        if (dp[i - 1][sum]) {
            ArrayList<Integer> b = new ArrayList<>(p);
            printSubsetsRec(arr, i - 1, sum, b, size);
        }

        if (sum >= arr[i] && dp[i - 1][sum-arr[i]]) {
            p.add(arr[i]);
            printSubsetsRec(arr, i - 1, sum-arr[i], p, size);
        }
    }

    private void buildSubsets(int[] arr, int n, int sum, int size) {

        dp = new boolean[n][sum + 1];
        for (int i= 0; i < n; ++i)
            dp[i][0] = true;

        for (int i = 1; i < n; ++i)
            for (int j = 0; j < sum + 1; ++j)
                dp[i][j] = (arr[i] <= j) ? (dp[i - 1][j] || dp[i - 1][j-arr[i]]) : dp[i - 1][j];

        ArrayList<Integer> p = new ArrayList<>();
        printSubsetsRec(arr, n-1, sum, p, size);
    }

    public static void main(String[] args) {
        Testy testy = new Testy();
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++)
            arr[i] = i;
        int n = arr.length;
        int sum = 100;
        testy.buildSubsets(arr, n, sum, 2);
        System.out.println("done");
        testy.printAllCombinations();
    }

    private void printAllCombinations() {
        for(Object[] a: allCombinations) {
            System.out.println(Arrays.toString(a));
        }
    }
}
//This code is contributed by Sumit Ghosh 
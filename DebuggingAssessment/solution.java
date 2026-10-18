import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Fix 1: Use long because K can be as large as 10^18.
        long k = sc.nextLong();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long front = k / 2;
        long back = (k + 1) / 2;

        int left = 0;
        int right = n - 1;
        int ans = 0;

        while (left <= right) {

            // Fix 2: Use >= so a chest opens when energy
            // exactly equals its requirement.
            if (front >= a[left]) {
                front -= a[left];
                ans++;
                left++;
            } else {
                break;
            }

            // Fix 3: Check that chests remain before processing
            // the right side, preventing the middle chest
            // from being counted twice.
            if (left <= right) {
                if (back >= a[right]) {
                    back -= a[right];
                    ans++;
                    right--;
                } else {
                    break;
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }
}


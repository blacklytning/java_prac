# THE GREAT TREASURE HUNT

## Problem Statement

An ancient temple contains `N` treasure chests arranged in a straight corridor. Each chest requires a certain amount of energy to unlock, represented by an array `A` of size `N`.

You have a total energy reserve of `K` units, divided into two reserves:

- `front = K / 2` for opening chests from the left entrance.
- `back = (K + 1) / 2` for opening chests from the right entrance.

You must alternate between the two entrances, starting from the left. A chest can be opened if the corresponding energy reserve is greater than or equal to the energy required to unlock it. Once a chest is opened, the required energy is consumed, and the explorer moves inward.

If a chest cannot be opened with the remaining energy allocated to its side, the expedition ends immediately. The expedition also ends when all chests have been opened or the explorers meet or cross.

Your task is to identify and correct the bugs in the given Java code so that it correctly calculates the total number of treasure chests opened.

## Input Format

- The first line contains two space-separated integers `N` and `K`, representing the number of treasure chests and the total energy reserve.
- The second line contains `N` space-separated integers representing the energy required to unlock each chest.

## Output Format

Print a single integer representing the total number of treasure chests successfully opened before the expedition ends.

## Constraints

- `1 <= N <= 10^5`
- `1 <= K <= 10^18`
- `1 <= A[i] <= 10^9`

## Sample Input

```text
5 10
2 1 3 2 2
```

## Sample Output

```text
4
```

## Explanation

The total energy reserve is `10`, so the front and back reserves each start with `5` units.

1. The first chest requires `2` energy units. It is opened from the front, leaving `3` units.
2. The last chest requires `2` energy units. It is opened from the back, leaving `3` units.
3. The second chest requires `1` energy unit. It is opened from the front, leaving `2` units.
4. The fourth chest requires `2` energy units. It is opened from the back, leaving `1` unit.
5. The middle chest requires `3` energy units, but the front reserve has only `2` units. The expedition ends.

Therefore, the total number of chests opened is `4`.

## Buggy Java Code

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

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
            if (front > a[left]) {
                front -= a[left];
                ans++;
                left++;
            } else {
                break;
            }

            if (back > a[right]) {
                back -= a[right];
                ans++;
                right--;
            } else {
                break;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
```

## Additional Test Cases

### Test Case 1

**Input**
```text
1 2
1
```

**Expected Output**
```text
1
```

### Test Case 2

**Input**
```text
2 4
1 2
```

**Expected Output**
```text
2
```

### Test Case 3

**Input**
```text
3 1000000000000000000
1 1 1
```

**Expected Output**
```text
3
```

### Test Case 4

**Input**
```text
5 10
2 1 3 2 2
```

**Expected Output**
```text
4
```

### Test Case 5

**Input**
```text
4 10
2 2 2 2
```

**Expected Output**
```text
4
```

### Test Case 6

**Input**
```text
3 6
1 1 1
```

**Expected Output**
```text
3
```



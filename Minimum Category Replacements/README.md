## Sample Problem: Minimum Category Replacements

### Problem Statement
Given an array containing only `1`, `2`, and `3`, make all elements belong to the same category using the minimum number of replacements.

### Input
The first line contains an integer `N`, representing the number of elements.

The second line contains `N` space-separated integers, each belonging to `{1, 2, 3}`.

### Output
Print the minimum number of replacements required.

### Constraints
- `1 ≤ N ≤ 10^5`
- Each array element belongs to `{1, 2, 3}`.

### Sample Input
6
1 2 3 3 3 1

### Sample Output
3

### Explanation
Category `1` appears twice, category `2` appears once, and category `3` appears three times.

Keep category `3` and replace the other three elements.

Minimum replacements = N − Maximum Frequency = 6 − 3 = 3.

### Complexity
- Time Complexity: `O(N)`
- Space Complexity: `O(1)`

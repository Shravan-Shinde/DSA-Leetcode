import java.util.*;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            int num = q.remove();

            if (num >= low && num <= high) {
                res.add(num);
            }
            int lastDigit = num % 10;
            if (lastDigit < 9) {
                q.add(num * 10 + (lastDigit + 1));
            }
        }
        Collections.sort(res);
        return res;
    }
}
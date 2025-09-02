import java.math.BigInteger;

class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        if (n < 3) return false;

        // choose split: [0, i) and [i, j) are the first two numbers
        for (int i = 1; i <= n - 2; i++) {
            // leading zero not allowed unless the number itself is "0"
            if (num.charAt(0) == '0' && i > 1) break;

            for (int j = i + 1; j <= n - 1; j++) {
                if (num.charAt(i) == '0' && j - i > 1) break;

                if (isValid(num, i, j)) return true;
            }
        }
        return false;
    }

    private boolean isValid(String num, int i, int j) {
        BigInteger a = new BigInteger(num.substring(0, i));
        BigInteger b = new BigInteger(num.substring(i, j));
        int k = j;

        while (k < num.length()) {
            BigInteger c = a.add(b);
            String s = c.toString();

            if (!num.startsWith(s, k)) return false;

            k += s.length();
            a = b;
            b = c;
        }
        return true; // consumed entire string following additive rule
    }
}
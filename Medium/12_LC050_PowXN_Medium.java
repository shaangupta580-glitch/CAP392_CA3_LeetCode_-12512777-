class Solution {
    public double myPow(double x, int n) {
        long power = Math.abs((long) n);   
        double result = 1;
        double base = x;

        while (power > 0) {
            if (power % 2 == 1) {
                result *= base;
            }
            base *= base;
            power /= 2;
        }

        if (n < 0) {
            return 1 / result;            
        }
        return result;
    }
}

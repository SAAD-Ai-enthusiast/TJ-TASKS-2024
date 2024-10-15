public class Q2 {
    public static int climbStairs(int n) {
       //write your code here
        if (n == 1) {
            return 1;
        }if (n == 2) {
            return 2;
        } else {
            return climbStairs(n-1) + climbStairs(n-2);
        }

    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(climbStairs(n));
    }
}

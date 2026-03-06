package BinarySearch;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Main obj = new Main();
        int res = obj.mySqrt(x);
        System.out.println(res);
    }

    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int s = 1;
        int e = x;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (x > (long) mid * mid) {
                s = mid + 1;
            } else if (x == (long) mid * mid) {
                return mid;
            } else {
                e = mid;
            }
        }
        return s - 1;
    }
}




import java.util.Scanner;

public class physics {
    public boolean eq(int n, int x[], int y[], int z[]) {
        if (n <= 0)
            throw new IllegalArgumentException("n must be positive integer");
        int sumX = 0, sumY = 0, sumZ = 0;
        while (n > 0) {
            sumX += x[n-1];
            sumY += y[n-1];
            sumZ += z[n-1];
            n--;
        }
        if (sumX == 0 && sumY == 0 && sumZ == 0)
            return true;
        else
            return false;
    }
}

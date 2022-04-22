import java.util.Scanner;

public class physics {
    public static void main(String[] args) {

        int n, x, y, z, sumX = 0, sumY = 0, sumZ = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            sumX += x;
            sumY += y;
            sumZ += z;
            n--;
        }
        if (sumX == 0 && sumY == 0 && sumZ == 0)
            System.out.println("Yes");

        else
            System.out.println("No");
    }
}

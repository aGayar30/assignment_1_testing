import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        int w;
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        if (w % 2==0 && w != 2)
            System.out.println("Yes");
        else
         System.out.println("No");
    }
}

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter the values of x and y");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        computePointOfInterception(x, y);
    }

    public static int computePointOfInterception(int x, int y) {

        while (x!=y) {
            x %= 12;
            y %= 12;
            x += 2;
            y += 1;
        }
        System.out.println("The point at which x and y meet is "+x);

        return 0;
    }
}
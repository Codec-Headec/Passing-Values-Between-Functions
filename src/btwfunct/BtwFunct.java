//Communication betw functions
package btwfunct;
import java.util.*;

public class BtwFunct{
    public static void main(String[] args) {
        int a, b, c, sum;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter any three number:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sum = calSum(a, b, c);
        System.out.println("Sum ="+sum);
    }
    static int calSum(int x, int y, int z ){
        int d;
        d = x + y + z;
        return(d);
    }
}
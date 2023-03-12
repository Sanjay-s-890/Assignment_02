package Q_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = dsum(n);
        System.out.println(x);
    }

    public static int dsum(int n)
    {
        if(n==0)
            return 0;
        return (n%10 + dsum(n/10));
    }

}


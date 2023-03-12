package Q_02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = magic(n);
        System.out.println(x);
    }

    public static int magic(int n)
    {
        int t= n;
        while(t>9)
        {
            t= dsum(t);
        }
        if(t==1)
            return 1;
        else
            return 0;
    }

    public static int dsum(int x)
    {
        if(x==0)
            return 0;
        return (x%10 + dsum(x/10));
    }
}

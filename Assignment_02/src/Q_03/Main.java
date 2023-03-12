package Q_03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = Power(a,b);
        System.out.println(x%c);
    }

    public static int Power(int a , int b)
    {
        if(b==0)
            return 1;
        return (a * Power(a , b-1));
    }
}

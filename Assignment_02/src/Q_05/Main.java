package Q_05;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<(1<<n); i++)
        {
            list.add(i^(i>>1));
        }
        System.out.println(list);
    }
}

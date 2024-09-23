package Arrays.E1;
import java.util.Scanner;
public class e1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] values=new int[n];
        for(int i=0;i<n;i++)
        {
            values[i]=sc.nextInt();
        }
        System.out.println(max(values));
    }
    public static int max(int[] values)
    {
        int max=values[0];
        for(int i=1;i<values.length;i++)
        {
            if(values[i]>max)
            {
                max=values[i];
            }
        }
        return max;
    }

    
}

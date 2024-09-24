package Arrays.E4;
import java.util.Arrays;
import java.util.Scanner;
public class e4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }

       // int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        //put your code here
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i==0 || array[i]>array[i-1]) && (i==array.length-1 || array[i]>array[i+1]) ) {
                continue;
            }
            result[index++]=array[i];
        }
return Arrays.copyOf(result, index);
    
}
}
package Arrays.E3;
import java.util.Arrays;
import java.util.Scanner;
public class e3 {
    public static boolean[] getSumCheckArray(int[] array){

        //put your code here
        boolean[] checkArray = new boolean[array.length];
        checkArray[0] = false;
        checkArray[1] = false;
        for(int i=2; i<array.length; i++){
            if(array[i-1] +array[i-2]==array[i]){
                checkArray[i] = true;
            }
        }
        return checkArray;

        //throw new UnsupportedOperationException();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
            
        }
        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }
    
}

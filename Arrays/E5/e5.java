package Arrays.E5;
import java.util.Scanner;
public class e5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int shift=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
       

    }
    static void cycleSwap(int[] array) 
    {
        if(array.length>1)
        {
            int le=array[array.length-1];
            for(int i=array.length-1;i>0;i++)
            {
                array[i]=array[i-1];
            }
            array[0]=le;
        }
  
      }
  
      static void cycleSwap(int[] array, int shift) 
      {
          if(array.length>1 && shift>0)
          {
              shift =shift % array.length;
              int[] temp = new int[array.length];
              for(int i=0;i<array.length;i++)
              {
                  temp[(i+shift)%array.length]=array[i];
              }
              System.arraycopy(temp,0,array,0,array.length);
          }
  
      }
    
}


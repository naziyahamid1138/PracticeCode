import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    { 
        Scanner s = new Scanner(System.in);
        int[]arr=new int[8];
        int i;
        for ( i=0;i<8;i++)
        {int a=s.nextInt();
            arr[i]=a;

        }
        int count=0;
        for( i=0;i<8;i++)
        {
            if(arr[i]%2==0)
            {
                count++;
            }
        }
        System.out.println("even number count is:"+count);        

    }
}
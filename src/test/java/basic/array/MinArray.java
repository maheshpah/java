package basic.array;

public class MinArray {
    public static void main(String [] args)
    {
        int [] a={5,2,3,4,1,6};
        int min=a[0];
        for(int i=0; i<a.length; i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }


        System.out.print(min);
    }
}

package basic.array;

public class MaxArray {

    public static void main(String [] args)
    {
        int[] a={1,2,8,4,5,6};

        int max=a[0];
        for(int i=0; i<a.length; i++)
        {
           if(max<a[i])
           {
               max=a[i];
           }
        }
        System.out.print(max);

    }
}

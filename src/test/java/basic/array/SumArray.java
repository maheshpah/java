package basic.array;

public class SumArray {

    public static void main(String []args)
    {
        int [] a={1,2,3,4,5,6};
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
             //sum=sum+i;
             sum+=i;
        }
        System.out.print(sum);
    }
}

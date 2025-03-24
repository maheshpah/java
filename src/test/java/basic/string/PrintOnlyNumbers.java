package basic.string;

public class PrintOnlyNumbers {

    public static void main(String []args)
    {
        String s="fanish123";
        char[] ch=s.toCharArray();

        for(int i=0; i<ch.length; i++)
        {
            if(ch[i] >='0' && ch[i] <='9')
            {
                System.out.println(ch[i]);
            }
        }
    }
}

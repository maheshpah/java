package basic.string;

public class CharFrequency {
public static void main(String []args)
{

    String s="fanisha";
    int k=0;
    char[] ch=s.toCharArray();
    for(int i=0; i<ch.length; i++)
    {
        if(ch[i]=='a')
        {
            k++;
        }
    }
    System.out.println(k);
}

}

package basic.string;

public class PrintString {

    public static void main(String []args)
    {
        String s="Fanish1234@#$%^";
        char []ch=s.toCharArray();

        //If I want to print String
        System.out.println(s);

        //if I want to print length of string
        System.out.println(s.length());

        //If I want to print each char(numeric/alphabets/special char)
        // Array index will start from zero so always i=0
        for(int i=0; i<ch.length; i++)
        {
            System.out.println(ch[i]);
        }

        //If I want to print each char(numeric/alphabets/special char)
        // String index will start from zero so always i=0
        for(int i=0; i<s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}

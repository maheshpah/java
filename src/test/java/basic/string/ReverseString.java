package basic.string;

public class ReverseString {

      public static void main(String [] args)
      {
          String s="fanish123@#$";
          char [] ch=s.toCharArray();

          //index starts from zero that is the reason length-1
          for(int i=ch.length-1; i>=0; i--)
          {
              System.out.println(ch[i]);
          }
      }
}

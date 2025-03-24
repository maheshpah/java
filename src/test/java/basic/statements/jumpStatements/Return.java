package basic.statements.jumpStatements;

public class Return {


//    static int  x=5;
//    static int  y=3;
//
//    public static void add()
//    {
//        System.out.print(x+y);
//    }
    public static void main(String [] args)
    {
//        Return r=new Return();
//        r.add();
        int result=addNumber(5,3);
        System.out.print(result);
    }

    public static int addNumber(int a, int b) {
       return (a * b);
    }




}

package basic.statements.Selection_statements;

import java.util.Scanner;

public class Mulitple_If_Statements {

    public static void main(String[]args)
    {

        Scanner scanner=new Scanner(System.in);
        int num =scanner.nextInt();
        if(num>0)
        {
            System.out.print("It ia positive value");
        }
        else if(num<0)
        {
            System.out.print("It ia negative value");
        }
        else
        {
            System.out.print("Value is zero and it is not a negative not positive");
        }
        
    }
}

package basic.statements.Selection_statements;

import java.util.Scanner;

public class If_Statements {

    public static void main(String[]args)
    {

        Scanner scanner=new Scanner(System.in);
        int num =scanner.nextInt();
        if(num>0)
        {
            System.out.print("It ia positive value");
        }

    }
}

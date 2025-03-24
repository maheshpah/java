package basic.statements.Selection_statements;

import java.util.Scanner;

public class Multiple_IF_2_Statements {

    public static void main(String[]args)
    {

        Scanner scanner=new Scanner(System.in);
        String fruit = scanner.next();

        if(fruit.equals("apple"))
        {
            System.out.print("Apple is a fruit");
        }
        else if(fruit.equals("kiwi"))
        {
            System.out.print("kiwi is a fruit");
        }
        else if(fruit.equals("mango"))
        {
            System.out.print("mango is a fruit");
        }
        else  if(fruit.equals("banana"))
        {
            System.out.print("banana is a fruit");
        }
        else
        {
            System.out.print("it is not a fruit");
        }


        
    }
}

package basic.statements.Selection_statements;


import java.util.Scanner;

public class Switch_Statements {
    public static void main(String []args)
    {
        //int daynumber=1;
        Scanner scanner=new Scanner(System.in);
        int daynumber=scanner.nextInt();

        switch (daynumber)
        {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wed");
                break;
            case 4:
                System.out.print("Thur");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Sat");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Invalid number");
                break;
        }



    }
}

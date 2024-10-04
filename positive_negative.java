import java.util.Scanner;
class positive_negative
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        a= sc.nextInt();
        if(a>0)
            System.out.println("Positive Number");
        else if (a<0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");
    }
}]
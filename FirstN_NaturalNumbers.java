import java.util.Scanner;
public class FirstN_NaturalNumbers 
{
    public static void main(String[] args) 
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        n= sc.nextInt();
        for(i=1;i<=n;i++)
            System.out.println(i);
    }
}
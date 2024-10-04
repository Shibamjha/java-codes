import java.util.Scanner;
class Natural_Numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter Number:");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}
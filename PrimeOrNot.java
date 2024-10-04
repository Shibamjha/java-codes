import java.util.Scanner;
public class PrimeOrNot
{
    public static void main(String[] args)
    {
        int i,n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to check");
        n=sc.nextInt();

        i=1;
        while(i<=n)
        {
            if(n%i==0)
                count++;
            i++;
        }
        if(count==2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
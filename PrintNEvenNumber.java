import javax.swing.*;
import java.util.Scanner;
public class PrintNEvenNumber 
{
    public static void main(String[] args) 
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++) 
        {
            if (i % 2 == 0) 
            {
                System.out.println(i);
                i++;
                break;
            }
            else 
            {
                System.out.println(i);
                i++;
                break;
            }
        }
    }
}
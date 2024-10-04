import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) 
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        i=sc.nextInt();

            if (i % 2 == 0)
                System.out.println("Number is even");
            else
                System.out.println("Number is odd");
    }
}
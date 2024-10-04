import java.util.Scanner;
        class max_min
        {
            public static void main(String args[])
            {
                int a,b;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter two numbers:");
                System.out.println("First Number:");
                a=sc.nextInt();
                System.out.println("Second Number:");
                b= sc.nextInt();
                if(a>b)
                    System.out.println("Max Number="+a);
                else
                    System.out.println("Max Number="+b);
            }
        }

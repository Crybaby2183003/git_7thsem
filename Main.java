import java.util.Scanner;

public class Main{
    public static void main(String[]args)
    {
         Scanner var = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=var.nextInt();

        
        int i = 0;
        while (i<n) 
        {
            int space=n-i;
            while (space>0)
             {
                System.out.print("  "); 
                space--;
            }
            int j=0;
            while (j<=i) 
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
    }
}
}
import java.util.Scanner;
public class yo {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int space=0;
        int j=n;
        while(i<=n){
            // int space=n-i;
            int x=1;
            while(x<=space){
                System.out.print("  ");
                x++;
            }
            int y=1;
            while(y<=j){
                System.out.print("* ");
                y++;
            }
            j--;
            System.out.println();
            i++;
        }
        sc.close();
    }
    
}

import java.util.Scanner;
public class j187 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int space=n-i;
        while(i<n){
            // int space=n-i;
            while(space>0){
                System.out.print(" ");
                space--;
            }
            int j=0;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
    
}

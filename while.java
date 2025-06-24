import java.util.Scanner;
public class while {
    public static void main(String []args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int i=0,j=0;
        while(i<n){
            while(j<n){
                System.out.print("* ");
                i++;
            }
        }
    }
}

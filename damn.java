import java.util.Scanner;
public class damn {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String rev="";
        // char c= Integer.toString(n);
        int k=n.length();
        for(int i=k-1;i>=0;i--){
            rev+=n.charAt(i);

        }
        
        System.out.println(rev);
        sc.close();

    }
}

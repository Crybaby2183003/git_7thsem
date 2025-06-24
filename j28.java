import java.util.Scanner;
public class j28{
    public static void main(String []args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter seconds");
        int n=inp.nextInt();
        int sec,min,hrs,days;
        
        
        
        days=n/86400;
        n=n%86400;
        hrs=n/3600;
        n=n%3600;
        min=n/60;
        n=n%60;
        sec=n;
        
        System.out.print("Days = "+days+": Hours = "+hrs+": Mins = "+min);
        System.out.println(": secs =  "+sec);
        


        inp.close();
    }
}
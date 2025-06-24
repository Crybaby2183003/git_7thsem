import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        


        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt(); 

        int i = 1; 
        while (i <= n) { 
            int j = 1;  
            while (j <= i) { 
                System.out.print("* "); 
                
                j++; 
                
            }
            
            System.out.println(); 
            i++; 
        }

        inp.close(); 
    }
}
import java.util.Scanner;

public class j297 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = inp.nextInt();
        }
        // int lo,hi,temp;
        // System.out.println("Enter the Lower range");
        // lo=inp.nextInt();
        // System.out.println("Enter the Higher range");
        // hi=inp.nextInt();
        // temp=hi;
        // for(int i=0;i<n;i++){
        // if(i>=lo && i<=hi){
        // System.out.print(arr[temp]+" ");
        // temp--;
        // }
        // else{
        // System.out.print(arr[i]+" ");
        // }
        // }

        // System.out.println("Enter the no. of rotation");

        // int k=inp.nextInt();
        // int t=n-k;

        // for(int i=t;i<n;i++){
        // System.out.print(arr[i]+" ");
        // }
        // for(int i=0;i<=k;i++){
        // System.out.print(arr[i]+" ");
        // }
        // for(int i=0;i<n;i++){
        // if(i%2==0){
        // for(int j=0;j<m;j++){
        // System.out.print(arr[j][i]);
        // }
        // }
        // else{
        // for(int j=m-1;j>=0;j--){
        // System.out.print(arr[j][i]);
        // }

        // }

        // }
        // for(int i=0;i<n;i++){
        // for(int j=0;j<m;j++){
        // System.out.print(arr[j][i]+" ");
        // }
        // System.out.println();
        // }
        int row_min = 0;
        int row_max = n - 1;
        int col_min = 0;
        int col_max = m - 1;
        while (row_min <= row_max && col_min <= col_max) {
            for (int i = row_min; i < row_max; i++) {
                System.out.print(arr[col_min][i] + " ");
            }
            col_min++;
            for (int i = col_min; i < col_max; i++) {
                System.out.print(arr[row_max][i] + " ");
            }
            row_max--;
            if (row_min <= row_max) {
                for (int i = row_max; i >= row_min; i--) {
                    System.out.print(arr[col_max][i] + " ");
                }
                col_max--;
                for (int i = col_max; i >= col_min; i--) {
                    System.out.print(arr[row_min][i] + " ");
                }
                row_min++;

            }

        }

        inp.close();
    }
}

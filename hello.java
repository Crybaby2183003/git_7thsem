//import java.util.Scanner;
//public class hello {
//	
//	public static void main(String []args) {
//		Scanner inp = new Scanner(System.in);
//		System.out.print("Hello");
//		
//		System.out.print("Hello");
//		System.out.print("Hello");
//		int a = inp.nextInt();
//}
//}


import java.util.Scanner;
public class hello {
	
	public static void main(String []args) {
		Scanner var = new Scanner(System.in);
// 		System.out.print("Hello");
		
// 		System.out.print("Hello");
// 		System.out.print("Hello");
//		System.out.println("Enter your marks:");
//		int a = var.nextInt();
//		if(a>80) {
//			System.out.println("Your grade is A");
//		}
//		else if(a>40 && a<=80) {
//			System.out.println("Your grade is B");
//		}
//		else {
//			System.out.println("Sorry you failed.");
//		}
//		System.out.println("Enter 1st no.");
//		int a = var.nextInt();
//		System.out.println("Enter 2nd no.");
//		int b = var.nextInt();
//		System.out.println("Enter 3rd no.");
//		int c = var.nextInt();
//		
//		if(a>b) {
//			if(a>c) {
//				System.out.println("First no. is largest");
//			}
//		}
//		else if(b>c) {
//			System.out.println("Second no. is largest");
//		}
//		else {
//			System.out.println("Third no. is largest");
//		}
		System.out.println("Enter no.");
		int n = var.nextInt();
		// for(int i=1;i<=n;i++) {
		// 	for(int j=1;j<=n;j++) {
		// 		System.out.print(j+" ");
		// 		if(i==j) {
		// 			break;
		// 		}
		// 	}
		// 	System.out.println();
		// }
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
				

			}
			System.out.println();
		}
		var.close();
	}
}
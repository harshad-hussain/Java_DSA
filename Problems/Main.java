package Problems;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
         Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int choice = s.nextInt();
		  int sum = 0;
		  long prod =0;


		 if(choice == 1 ){
			 for(int i=1;i<=n;i++){
				  sum = sum +i ;
			 }
			 System.out.println(sum);
			}
			 
			 else if(choice ==2){
				 for(int i=1;i<=n;i++){
                   prod = prod * i;
				 }
				 System.out.println(prod);
			 }
			 else{
                System.out.println(-1);
			 }
		 
	}
}

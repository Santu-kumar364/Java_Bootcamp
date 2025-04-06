package Java_Bootcamp.Basics;

// import java.util.Scanner;
// public class Solution {
// 	public static boolean isPrime(int num) {
// 		int c = 2;
// 		while(c*c <= num) {
// 			if(num % c == 0) {
// 				return false;
// 			}
// 			c++;
// 		}
// 		return true;
// 	}

// 	public static void main(String[] args) {

// 		Scanner sc = new Scanner(System.in);
// 		int num = sc.nextInt();
		

// 		if(isPrime(num)) {
// 			System.out.println("YES");
// 		}
// 		else {
// 			System.out.println("NO");
// 		}
	
// 	}
// }



class Solution {

	static void power(int base, int exeponent) {
		int ans = 1;

		if(exeponent == 0) {
			System.out.println(1);
			return;
		}
		if(base == 0) {
			System.out.println("Invalid");
			return;
		}

		for(int i = 1; i <= exeponent; i++) {
			ans *= base; 
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {

		power(2,5);	
	}
}












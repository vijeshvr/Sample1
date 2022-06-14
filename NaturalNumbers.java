import java.util.Scanner;


public class NaturalNumbers {
	//print first n positive integer number
	public static void naturalnumbers(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n= sc.nextInt();
	 for(int i =1;i<=n;i++){
		 System.out.println(i);
	 }
	}

	public static void main(String[] args) {
		naturalnumbers();


	}

}

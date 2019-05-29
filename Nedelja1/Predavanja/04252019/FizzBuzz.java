package yadaci12345;

public class FizzBuzz {

	public static void main(String[] args) {
		int n = 100, i = 1;
		/*
		 * while (i <= n) { if (i % 3 == 0 && i % 5 == 0) {
		 * System.out.println("FizzBuzz"); } else if (i % 3 == 0) {
		 * System.out.println("Fizz"); } else if (i % 5 == 0) {
		 * System.out.println("Buzz"); }else { System.out.println(i); } i+=1; }
		 */
		/*while (i <= n) {
			if (i % 3 == 0) {
				System.out.print("Fizz");
			}
			if (i % 5 == 0)
				System.out.print("Buzz");
			else if(i%3!=0){
				System.out.print(i);
			}
			System.out.println();
			i+=1;
		}*/
		String s="";
		while(i<=n) {
			s="";
			if(i%3==0)s+="Fizz";
			if(i%5==0)s+="Buzz";
			if(s=="")s+=i;
			System.out.println(s);
			i+=1;
		}
	}

}
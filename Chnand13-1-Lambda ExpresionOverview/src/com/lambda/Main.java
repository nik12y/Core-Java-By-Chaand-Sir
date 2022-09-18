package com.lambda;
/* Lambda Rules
 * 1. When there is only one statement Then no need to use Curly braces{} 
 * 2. DO not use the data type which are present in interface when use of lambda expression
 * 3. also some time return key word also not use
 */
public class Main {

	public static void main(String[] args) {

		//2nd way by creating anonymous class
		LengthInter inter=new LengthInter() {
			
			@Override
			public int getLength(String str) {
				return str.length();
			}
		};
		System.out.println(inter.getLength("Hi i am call from Anonymous"));
		//2nd way for length method
		LengthInter length=str->  str.length();
		System.out.println("THe length of given String is "+length.getLength("Hi I'm calling from lambda expression"));
		
		
		System.out.println("*************************************");
	//1st way of adding two number from interface	
		SumInter sum=new SumInter() {
			
			@Override
			public int sum(int a, int b) {
				
				return a+b;
			}
		};
		int sum2 = sum.sum(2, 5);
		System.out.println(sum2);
		
   //2nd Way by lambda expression
//		SumInter add=(a,b)->{return a+b;}; Also apply Two Rules
		SumInter add=(a,b)-> a+b;
		System.out.println(add.sum(5, 7));
	}
	

}

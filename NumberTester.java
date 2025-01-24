//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberTester
{
	public static void main(String[] args)
	{
		//add test cases
		Number myNum = new Number(6); // even and perfect 
		System.out.println(myNum);

		Number myNum1 = new Number(7); // odd not perfect
		System.out.println(myNum1);

		Number myNum2 = new Number(28); // even and perfect
		System.out.println(myNum2);

		Number myNum3 = new Number(13); // odd and not perfect
		System.out.println(myNum3);

		Number myNum4 = new Number(1); // odd and not perfect because it can only be % by 1 and you cant % by the number itself
		System.out.println(myNum4);


		//add more test cases




	}
}
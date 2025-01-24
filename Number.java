//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Number
{
	//Instance Variable
	private Integer number;

	//Default Constructor
	public Number()
	{
		//autoboxing
		number=0;
	}

	//Modified Constructor
	public Number(int num)
	{
		setNumber(num);
	}

	//Methods
	public void setNumber(int num)
	{
		number = num;
	}

	public int getNumber()
	{
		return number;
	}

	public boolean isOdd()
	{
		if(number % 2 == 1)
		return true;
		return false;
	}

	public boolean isPerfect()
	{
		int total=0;
		// use % use loop start at 1 use -1 at the end only do number.java and numberTester.java

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		//A perfect number is any number equal to the sum of its divisors
		//excluding itself.


		return (number==total);
	}

	public String toString( )
	{

		String returnString;

		returnString = number + "\n";
		returnString += number + " isOdd == " + isOdd() + "\n";
		returnString += number + " isPerfect == " + isPerfect() + "\n\n";

		//return "" + returnString;
		return "" + number;
	}
}
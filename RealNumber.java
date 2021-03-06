public class RealNumber
{
	private double number;
	
	public RealNumber()
	{
		number = 0.0;
	}

	public RealNumber(double inNumber)
	{
		number = 0.0;
		setRealNumber(inNumber);
	}

	public RealNumber(RealNumber inNumber)
	{
		number = inNumber.getNumber();
	}

	public double getNumber()
	{
		return number;
	}

	public void setRealNumber(double inNumber)
	{
		setNumber(inNumber);
	}

	public void setNumber(double inNumber)
	{
		number = inNumber;
	}

	public void add(RealNumber inNumber)
	{
		number = number + inNumber.getNumber();
	}

	public void subtract(RealNumber inNumber)
	{
		number = number - inNumber.getNumber();
	}

	public void multiply(RealNumber inNumber)
	{
		number = number * inNumber.getNumber();
	}

	public void divide(RealNumber inNumber)
	{
		if(Math.abs(inNumber.getNumber()) >= 0.001)
		{
			number = number / inNumber.getNumber();
		}
		else
		{
			System.out.println("Division cannot be evaluated, because the denomenator = 0");
		}
	}

	public boolean equals(RealNumber inRealNumber)
	{
		boolean valid;
		valid = false;
		if(number == inRealNumber.getNumber())
		{
			valid = true;
		}
		return valid;
	}

	public String toString()
	{
		String outString;
		outString = "" + number;
		return outString;
	}
}

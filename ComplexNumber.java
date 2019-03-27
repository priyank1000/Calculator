public class ComplexNumber extends RealNumber
{
	private double imagPart;

	public ComplexNumber()
	{
		super();
		imagPart = 0.0;
	}

	public ComplexNumber(double inNumber, double inImagePart)
	{
		super(inNumber);
		imagPart = 0.0;
		setImagPart = inImagePart;
	}

	public ComplexNumber(ComplexNumber inComplexNumber)
	{
		super(inComplexNumber);
		imagPart = inComplexNumber.getImagPart();
	}

	public double getImagPart()
	{
		return imagPart;
	}

	public void setComplexNumber(double inImagPart)
	{
		setImagPart(inImagPart);
	}
	
	public void setImagPart(double inImagPart)
	{
		imagPart = inImagPart;
	}

	public void setRealPart(double inRealPart)
	{
		super.setNumber(inRealPart);
	}

	public void add(ComplexNumber inNumber)
	{
		super.setNumber((super.getNumber() + inNumber.getNumber()));
	 	setImagPart(imagPart + inNumber.getImagPart());
	}

	public void subtract(ComplexNumber inNumber)
	{
		super.setNumber((super.getNumber() - inNumber.getNumber()));
	 	setImagPart(imagPart - inNumber.getImagPart());
	}

	public void multiply(ComplexNumber inNumber)
	{
		double realPart;
		realPart = super.getNumber();
		super.setNumber((realPart * inNumber.getNumber() - imagPart * inNumber.getImagPart()));
	 	setImagPart(imagPart * inNumber.getNumber() + realPart * inNumber.getImagPart());
	}

	public void divide(ComplexNumber inNumber)
	{
		double realPart;
		realPart = super.getNumber();

		if(Math.abs(inNumber.getNumber()) >= 0.001 || Math.abs(inNumber.getImagPart()) >= 0.001)
		{
			super.setNumber((realPart * inNumber.getNumber() + imagPart *  inNumber.getImagPart()) / (inNumber.getNumber() * inNumber.getNumber() + inNumber.getImagPart() * inNumber.getImagPart()));
	 		setImagPart((imagPart * inNumber.getNumber() - realPart * inNumber.getImagPart()) / (inNumber.getNumber() * inNumber.getNumber() + inNumber.getImagPart() * inNumber.getImagPart()));
		}
		else
		{
			System.out.println("Division is undefined, because the denominator = 0");
		}
	}
		
	public boolean equals(ComplexNumber inComplexNumber)
	{
		boolean valid;
		valid = false;
		if(super.equals(inComplexNumber.getImagPart()) && imagPart == inComplexNumber.getImagPart())
		{
			valid = true;
		}
		return valid;
	}
	
	public String toString()
	{
		String outString;
		outString = super.toString() + " + " + imagPart + "i";
		return outString;
	}
}	


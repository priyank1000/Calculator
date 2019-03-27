
import io.*;
public class Calculator
{
    public static void main(String[] args)
    {
        int select, choice;
        double num1, num2, comp1, comp2, real1, real2;
        RealNumber realNum1, realNum2;
        ComplexNumber compNum1, compNum2;
        System.out.println("Select 1 for inputting real numbers");
        System.out.println("Select 2 for inputting complex numbers");
        System.out.println("Select 3 to Exit the program"); /* Outputs to the user to select from 1 to 3 in order to perfom jobs */

        select = ConsoleInput.readInt("Select a number from 1 to 3");

        /* Introducing a while loop so that if the the user selects any number apart from three, then it will re-display the menu */
        while (select != 3)
        {
            select = validSelect(select); /* Calling a submodule for validating what has been selected, that is select 1, 2 or 3 for inputting real numbers, complex numbers or exit the program respectively. */

            if (select == 1)
            {
                num1 = ConsoleInput.readDouble("Enter 1st real Number");
                realNum1 = new RealNumber(num1); //Create an object of real number 1 using alternate constructor
                num2 = ConsoleInput.readDouble("Enter 2nd real Number");
                realNum2 = new RealNumber(num2); //Create an object of real number 2 using alternate constructor

// Outputs the options from which the user can choose
                System.out.println("Choose 1: Add the numbers");
                System.out.println("Choose 2: Subtract the numbers");
                System.out.println("Choose 3: Multiply the numbers");
                System.out.println("Choose 4: Divide the numbers");
                choice = ConsoleInput.readInt("Select a number from 1 to 4");
                choice = validChoice(choice); /* Calling a submodule for validating the choice that has been entered, that is choose 1,2,3 or 4 in order to perform add, subtract, multiply or divide respectively */

                switch (choice)
                {
                    case 1:
                        realNum1.add(realNum2); //Method to add the real number 1 and real number 2
                        realNum1.setNumber(Math.round(realNum1.getNumber() * 10000.0) / 10000.0); //Method to round the result to four decimal places
                        System.out.println("Result = " + realNum1.toString()); //The result is printed to the screen
                        break;
                    case 2:
                        realNum1.subtract(realNum2); //Method to subtract real number 2 from real number 1
                        realNum1.setNumber(Math.round(realNum1.getNumber() * 10000.0) / 10000.0); //Method to round the result to four decimal places
                        System.out.println("Result = " + realNum1.toString()); //The result is printed to the screen
                        break;
                    case 3:
                        realNum1.multiply(realNum2); //Method to multiply real number 1 to real number 2
                        realNum1.setNumber(Math.round(realNum1.getNumber() * 10000.0) / 10000.0); //Method to round the result to four decimal places
                        System.out.println("Result = " + realNum1.toString()); //The result is printed to the screen
                        break;
                    case 4: //If statement to check if divison is valid or not
                        if (Math.abs(realNum2.getNumber()) >= 0.001)
                        {
                            realNum1.divide(realNum2); //Method to divide real number 1 to real number 2
                            realNum1.setNumber(Math.round(realNum1.getNumber() * 10000.0) / 10000.0); //Method to round the result to four decimal places
                            System.out.println("Result = " + realNum1.toString()); //The result is printed to the screen
                        } 
				   else
                        {
                            System.out.println("Division undefined, because the denomenator = 0"); //Prints out a message indicating divison is undefined(invalid)				
                        }
                        break;
                }
            } 
		  else if (select == 2)
            {
                real1 = ConsoleInput.readDouble("Enter the 1st real part");
                comp1 = ConsoleInput.readDouble("Enter the 1st imaginary part");
                compNum1 = new ComplexNumber(real1, comp1); //Create an object of complex number 1 using alternate constructor
                real2 = ConsoleInput.readDouble("Enter the 2nd real part");
                comp2 = ConsoleInput.readDouble("Enter the 2nd imaginary part");
                compNum2 = new ComplexNumber(real2, comp2); //Create an object of complex number 2 using alternate constructor 

//Outputs a list of options from which user can choose to perfrom the operations
                System.out.println("Choose 1: adding the numbers");
                System.out.println("Choose 2: subtracting the numbers");
                System.out.println("Choose 3: multiplying the numbers");
                System.out.println("Choose 4: Divide the numbers");
                choice = ConsoleInput.readInt("Select a number from 1 to 4");
                choice = validChoice(choice); /* Calling a submodule for validating the choice that has been entered, that is choose 1,2,3 or 4 in order to perform add, subtract, multiply or divide respectively */

                switch (choice)
                {
                    case 1:
                        compNum1.add(compNum2); // Method to add complex number 1 and complex number 2
                        compNum1.setNumber(Math.round(compNum1.getNumber() * 10000.0) / 10000.0); //Method to round the result to four decimal places
                        System.out.println("Result = " + compNum1.toString()); //result is printed out to the screen
                        break;
                    case 2:
                        compNum1.subtract(compNum2); //Method to subtract complex number 2 from complex number 1
                        compNum1.setNumber(Math.round(compNum1.getNumber() * 10000.0) / 10000.0); //Method to round the result to four decimal places
                        System.out.println("Result = " + compNum1.toString()); //Result is printed out to the screen
                        break;
                    case 3:
                        compNum1.multiply(compNum2); //Method to multiply complex number 1 to complex number 2
                        compNum1.setNumber(Math.round(compNum1.getNumber() * 10000.0) / 10000.0); //Method to round the result to four decimal places
                        System.out.println("Result = " + compNum1.toString()); //Result is printed out to the screen
                        break;
                    case 4: //If statement to check if divison is valid or not
                        if (Math.abs(compNum2.getNumber()) >= 0.001 || Math.abs(compNum2.getImagPart()) >= 0.001)
                        {
                            compNum1.divide(compNum2); //Method to divide complex number 1 to complex number 2
                            compNum1.setNumber(Math.round(compNum1.getNumber() * 10000.0) / 10000.0); //Method to round the result to four decimal places
                            System.out.println("Result = " + compNum1.toString()); //result is printed out to the screen
                        } 
				   else
                        {
                            System.out.println("Division invalid, because denomenator = 0"); //Outputs if the divison was undefined or invalid 
                        }
                        break;
                }

            }

            /* If the condition of the while loop does is not met that was set at the start of the program then it will re-diplay the menu as follows */
            System.out.println("Select 1 for inputting real numbers");
            System.out.println("Select 2 for inputting complex numbers");
            System.out.println("Select 3 to Exit the program");
            select = ConsoleInput.readInt("Select a number from 1 to 3");

        }
        System.out.println("Exit program");
        System.exit(0);
    }

    /* Method to ensure a valid input has been made by the user, if it is invalid, then it will output an error message to the user and hence re-enter a valid number */
    public static int validSelect(int select)
    {
        while (select < 1 || select > 3)
        {
            System.out.println("Invalid selection, Please enter 1, 2 or 3 to progress");
            select = ConsoleInput.readInt();
        }
        return select;
    }

    /* Method to ensure a valid choice(input) has been made by the user, if it is invalid, then it will output an error message to the user and hence re-enter a valid choice */
    public static int validChoice(int choice)
    {
        while (choice < 1 || choice > 4)
        {
            System.out.println("Invalid choice, Please enter 1, 2, 3 or 4 to progress");
            choice = ConsoleInput.readInt();
        }
        return choice;
    }
}


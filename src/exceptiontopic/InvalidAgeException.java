package exceptiontopic;

// Custom Exception / User Defined Exception

// 1. checked Exception---Compiletime Exception
//public class InvalidAgeException extends Exception


// 2. UnChecked Exception
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}

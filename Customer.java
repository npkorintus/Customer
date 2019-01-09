// Nick Korintus
// Lab Assignment 9

/**
	This class holds data about a customer
*/

public class Customer extends Person
{
	private String customerNumber;		// Customer number
	private boolean mailingList;		// Field that indicates if customer is on mailing list

	/**
		The constructor sets the customer's name, telephone number, address
		customer number, and whether they want to be on the mailing list or not.
		@param na The customer's name
		@param ph The customer's telephone number
		@param addr The customer's address
		@param num The customer number
		@param mail Indicator if customer is on mailing list or not
	*/
	public Customer(String na, String ph, String addr, String num, boolean mail)
	{
		// Call the super class constructor
		super(na, ph, addr);

		// Set customer number and mailing list value
		customerNumber = num;
		mailingList = mail;
	}

	/**
		The setNumber method sets the customer number
		@param num
	*/
	public void setNumber(String num)
	{
		customerNumber = num;
	}

	/**
		The setStatus method sets the boolean indicator for the mailing list
		@param mail
	*/
	public void setStatus(boolean mail)
	{
		mailingList = mail;
	}

	/**
		The getNumber method returns the customer's telephone number
		@return The value in the telephone number field
	*/
	public String getNumber()
	{
		return customerNumber;
	}

	/**
		The getStatus method returns whether or not the customer wants to be
		on the mailing list
		@return The true/false value in the mailingList field
	*/
	public boolean getStatus()
	{
		return mailingList;
	}

}
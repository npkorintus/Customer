// Nick Korintus
// Lab Assignment 9

/**
	This class holds data about a person
*/

public class Person
{
	private String name;		// The person's name
	private String address;		// The person's address
	private String telephone;	// The person's telephone number


	/**
		No-arg constructor
	*/
	public Person()
	{
		name = "";
		address = "";
		telephone = "";
	}

	/**
		This constructor sets the person's name, address, and telephone number
		@param n The person's name
		@param a The person's address
		@param t The person's telephone number
	*/
	public Person(String n, String a, String t)
	{
		name = n;
		address = a;
		telephone = t;
	}

	/**
		The setName method sets the person's name
		@param n
	*/
	public void setName(String n)
	{
		name = n;
	}

	/**
		The setAddress method sets the person's address
		@param a
	*/
	public void setAddress(String a)
	{
		address = a;
	}

	/**
		The setTelephone method sets the person's telephone number
		@param t
	*/
	public void setTelephone(String t)
	{
		telephone = t;
	}

	/**
		The getName method returns the person's name
		@return The value in the name field
	*/
	public String getName()
	{
		return name;
	}

	/**
		The getAddress method returns the person's address
		@return The value in the address field
	*/
	public String getAddress()
	{
		return address;
	}

	/**
		The getTelephone method returns the person's telephone number
		@return The value in the telephone field
	*/
	public String getTelephone()
	{
		return telephone;
	}
}
/********************************************
*	DEVELOPER:	Alyssa Pupping
* COLLABORATORS: N/A
*	LAST MODIFIED:	5/13/25
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient test1 = new DACArecipient();
    DACArecipient test2 = new DACArecipient();

    test1.setSurname("Miranda");
    test1.setGivenName("Daniel");
    test1.setUscisNumber("24-5-128");
    test1.setCountryOfOrigin("Mexico");
    test1.setBirthday(03042007);
    test1.setValidFromDate(041225);
    test1.setExpirationDate(041235);
    test1.setSex('M');

    System.out.println("Person 1");
    System.out.println("------------------------------------");
    System.out.println("Surname = " + test1.getSurname());
    System.out.println("Given Name = " + test1.getGivenName());
    System.out.println("USCIS Number = " + test1.getUscisNumber());
    System.out.println("Country of Origin = " + test1.getCountryOfOrigin());
    System.out.println("Birthday = " + test1.getBirthday());
    System.out.println("Valid From = " + test1.getValidFromDate());
    System.out.println("Expiration Date = " + test1.getExpirationDate());
    System.out.println("Sex = " + test1.getSex());

    test2.setAll("Eide", "Agnes", "33-4-225", "Norway", 12182005, 051325, 051335, 'F');

    System.out.println("Person 2");
    System.out.println("------------------------------------");
    System.out.println("Surname = " + test2.getSurname());
    System.out.println("Given Name = " + test2.getGivenName());
    System.out.println("USCIS Number = " + test2.getUscisNumber());
    System.out.println("Country of Origin = " + test2.getCountryOfOrigin());
    System.out.println("Birthday = " + test2.getBirthday());
    System.out.println("Valid From = " + test2.getValidFromDate());
    System.out.println("Expiration Date = " + test2.getExpirationDate());
    System.out.println("Sex = " + test2.getSex());
  }


}
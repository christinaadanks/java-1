/**
 * Activity for writing user defined classes.
 *
 * @author Christinaa Danks
 * @version 9/8/2020
 */
 
public class UserInfo  {
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constructor
   /**
    * Sets user's initial information.
    * @param firstNameIn is the user's first name.
    * @param lastNameIn is the user's last name.
    */
   public UserInfo(String firstNameIn, String lastNameIn)   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   // methods
   /**
    * returns string representation of user info.
    * @return user's information.
    */
   public String toString()   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)   {
         output += "Offline";
      }
      else  {
         output += "Online";
      }
      return output;
   }
   
   /**
    * Changes user's location.
    * @param locationIn is the user's new location.
    */
   public void setLocation(String locationIn)   {
      location = locationIn;
   }
   
   /** 
    * Changes user's age.
    * @param ageIn is the user's new age.
    * @return if the age is greater than 0.
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0)  {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
    * Gets the user's age.
    * @return user's age.
    */
   public int getAge()  {
      return age;
   }
   
   /**
    * Gets the user's location.
    * @return user's location.
    */
   public String getLocation()   {
      return location;
   }
   
   /**
    * allows user to log off.
    */
   public void logOff() {
      status = OFFLINE;
   }
   
   /**
    * allows user to log on.
    */
   public void logOn()  {
      status = ONLINE;
   }
}
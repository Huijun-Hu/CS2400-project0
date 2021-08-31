//Huijun Hu
//CS1400,section - 04
//Project 7 - Employee Inheritance
//05-03-2021

public class Employee
{
   private String name;
   private String number;
   private String date;

   public Employee()
   {
      name = "";
      number = "";
      date = "";
   }

   public Employee(String nam, String num, String dat)
   {
      name = nam;
      number = num;
      date = dat;
   }

   private boolean isValid(String num)
   {
      if ( num.length() != 5)
         return false;

      boolean check = true;

      Character c1 = num.charAt(0);
      Character c2 = num.charAt(1);
      Character c3 = num.charAt(2);
      Character c4 = num.charAt(3);
      Character c5 = num.charAt(4);

      if (!(Character.isDigit(c1)))
         check = false;
      if (!(Character.isDigit(c2)))
         check = false;
      if (!(Character.isDigit(c3)))
         check = false;
      if ( c4 != '-')
         check = false;
      if (!(Character.isLetter(c5) && Character.isUpperCase(c5)))
         check = false;

      return check;

   }

   public void setName(String s)
   {
      name = s;
   }

   public String getName()
   {
      return name;
   }

   public void setNumber(String s)
   {
      number = s;
   }

   public String getNumber()
   {
      return number;
   }

   public void setDate(String s)
   {
      date = s;
   }

   public String getDate()
   {
      return date;
   }

   public String toString()
   {
      String str;
      if ( this.isValid(number))
      {
         str = "Name: " + name + "\nEmployee Number: " + number + "\nHire Date: " + date;

      }
      else
      {
         str = "Name: " + name + "\nEmployee Number: INVALID EMPLOYEE NUMBER" + "\nHire Date: " + date;
      }
      return str;
   }
}
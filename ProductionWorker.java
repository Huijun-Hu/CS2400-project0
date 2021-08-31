//Huijun Hu
//CS1400, section - 04
//Project 7 - Employee Inheritance
//05-03-2021

import java.text.DecimalFormat;

public class ProductionWorker extends Employee
{
   private int shift;
   private double hourly_pay_rate;

   public ProductionWorker()
   {
      super();
      shift = 1;
      hourly_pay_rate = 0.0;
   }
   public ProductionWorker(String nam, String num, String dat, int shi, double rate)
   {
      super(nam, num, dat);
      shift = shi;
      hourly_pay_rate = rate;
   }

   public void setShift(int s)
   {
      shift = s;
   }

   public int getShift()
   {
      return shift;
   }
   public void setHourly_pay_rate(double d)
   {
      hourly_pay_rate = d;
   }

   public double getHourly_pay_rate()
   {
      return hourly_pay_rate;
   }

   public String toString()
   {
      DecimalFormat df = new DecimalFormat("0.00");
      String str;
         switch (shift)
         {
            case 1:
               str = super.toString() + "\nShift: Day\nHourly Pay Rate: $" + df.format(hourly_pay_rate);
               break;
            case 2:
               str = super.toString() + "\nShift: Night\nHourly Pay Rate: $" + df.format(hourly_pay_rate);
               break;
            default:
               str = super.toString() + "\nShift: INVALID SHIFT NUMBER\nHourly Pay Rate: $" + df.format(hourly_pay_rate);
               break;
         }
      return str;
   }
}
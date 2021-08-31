//Huijun Hu
//CS1400,section - 04
//Project 7 - Employee Inheritance
//05-03-2021

public class WorkerTest
{
   public static void main(String[] args)
   {
      System.out.println("Here's the first production worker.");
      ProductionWorker worker1 = new ProductionWorker("John Smith", "123-A", "11-15-2005", 1, 23.5);
      System.out.println(worker1.toString()+"\n");

      System.out.println("Here's the second production worker.");
      ProductionWorker worker2 = new ProductionWorker();
      worker2.setName("Joan Jones");
      worker2.setNumber("222-L");
      worker2.setDate("12-12-2018");
      worker2.setShift(2);
      worker2.setHourly_pay_rate(18.5);
      System.out.println(worker2.toString()+"\n");

      System.out.println("Here's the third production worker.");
      ProductionWorker worker3 = new ProductionWorker("Tony Gaddis", "41326", "1-23-2006", 0, 19.5);
      System.out.println(worker3.toString()+"\n");

   }
}
/* Program to find sum and average of 3 num using command line 
 arguments for input values at run time */
public class CommandLineDemo
 {
   public static void main(String[] args)
      {
          String name;                    //variable declarations
          int num1,num2,num3,sum=0;
          float avg;

          // take input from user from command prompt

          name= args[0];
          num1= Integer.parseInt(args[1]); //Type casting
          num2= Integer.parseInt(args[2]); 
          num3= Integer.parseInt(args[3]);

          // perform calculations

          sum=num1+num2+num3;
          avg=(float) sum/3;     //Type casting (converting one data type to another)

          System.out.println("The sum of 3 numbers is : " +sum);
          System.out.println("The avg of 3 numbers is : " +avg);
          System.out.println("Thankyou MR. "+name+" . Happy Coding");


       }
}
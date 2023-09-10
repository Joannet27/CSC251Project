import java.util.Scanner;
public class Project_joanne_tran
{
   public static void main(String[]arg)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int policyNumber = 0;
      String providerName = "";
      String firstName = "";
      String lastName = "";
      int age = 0;
      String smokeStatus = "";
      double height = 0.0;
      double weight = 0.0;
      
      
      System.out.print("Please enter the Policy Number: ");
      policyNumber=keyboard.nextInt();
       
      keyboard.nextLine();//buffer
      
      System.out.print("Please enter the enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder Age: ");
      age = keyboard.nextInt();
      
      keyboard.nextLine();//buffer
      
      System.out.print("Please enter the Policyholder Smoking Status (smoker/non-smoker): ");
      smokeStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder Height (in inches): ");
      height = keyboard.nextDouble();
       
      System.out.print("Please enter the Policyholder Weight (in pounds): ");
      weight = keyboard.nextDouble();
   
      
      // calling the object
      Policy info = new Policy(policyNumber, providerName, firstName, lastName, age, smokeStatus, height, weight);
      
      System.out.println("Policy Number: " + info.getPolicyNum());
      
      System.out.println("Provider Name: " + info.getProviderName());
       
      System.out.println("Policyholder First Name: " + info.getFirstName());
        
      System.out.println("Policyholder Last Name: " + info.getLastName());
         
      System.out.println("Policyholder Age: " + info.getAge());
          
      System.out.println("Policyholder Smoking Status: " + info.getSmokeStatuse());
           
      System.out.println("Policyholder Height: " + info.getHeight());
            
      System.out.println("Policyholder Weight: " + info.getWeight());
            
      System.out.printf("Policyholder BMI: %.2f \n",info.getBMI());
            
      System.out.printf("Policy Price: $%.2f",info.getPrice());
   
   }
}
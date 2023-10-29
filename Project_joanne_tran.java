import java.io.*; // PrintWriter, File, IOException, Files
import java.util.Scanner;
import java.util.ArrayList;
public class Project_joanne_tran
{
   public static void main(String[]arg) throws IOException
   {
      File insurance = new File("PolicyInformation.txt");
      if(!insurance.exists())
      {
         System.out.println("Unable to open files");
         System.exit(0);
      }
      
      Scanner file = new Scanner(insurance); //open
      
      int policyNumber = 0;
      String providerName = "";
      String firstName = "";
      String lastName = "";
      int age = 0;
      String smokeStatus = "";
      double height = 0.0;
      double weight = 0.0;
      int smoker = 0, nonSmoker = 0;
      
      /// array-list
      ArrayList<String> status = new ArrayList<String>();
      
      // using a loop to process the infomation the text file
      while(file.hasNext())
      {
         policyNumber = file.nextInt();
         providerName = file.nextLine();
         firstName = file.nextLine();
         lastName = file.nextLine();
         file.nextLine();// buffer to clear
         age = file.nextInt();
         file.nextLine();// buffer to clear
         smokeStatus = file.nextLine();
         height = file.nextDouble();
         weight = file.nextDouble(); 
         
         if(file.hasNext())
            file.nextLine();// to clear
         if(file.hasNext())
            file.nextLine();// to skip blank line
         
         status.add(smokeStatus);
      
         // calling the object
         PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smokeStatus, height, weight);
         Policy info = new Policy(policyNumber, providerName, holder);
      
         System.out.println(info.toString());
       
         System.out.printf("Policyholder BMI: %.2f \n",info.getHolderInfo().getBMI());
         System.out.printf("Policy Price: $%.2f \n",info.getHolderInfo().getPrice());
         
        
         
         System.out.println();// skip a line so the differen provider infomation are separated
         
         //the problem 
                  
                  
      }//while loop
      
      for (int i=0; i < status.size(); i++)
      {
         //System.out.println(i);
         if(status.get(i).equalsIgnoreCase("smoker"))
         {
            smoker += 1;
         }
         if (status.get(i).equalsIgnoreCase("non-smoker"))
         {
            nonSmoker += 1;
         }
         
      }// for loop
      
      System.out.println("The number of Policyholder that are smoker: " + smoker);
      System.out.println("The number of Policyholder that are non-smoker: " + nonSmoker);
      file.close();//IMPORTANT: always close the file
   }//main body
   
}// main class

public class Policy
{
   private int policyNum;
   private String providerName;
   private String firstName;
   private String lastName;
   private int holderAge;
   private String smokeStatus;
   private double height;
   private double weight;

   /**
     no-arg constructor that set default values to all the fields
   */
   public Policy()
   {
      policyNum = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      holderAge = 0;
      smokeStatus = "" ;
      height = 0.0;
      weight = 0.0;
   }
//--------------------------------------------------------------
   /**
     constructor that accepts necessary args
     @param num the policy number
     @param name The name of the provider
     @param fName The first name of the polic holder
     @param lName The last name of the policy holder
     @param age The policy holder name
     @param smoke The smoking status of the policy holder
     @param ht The height of the policy holder
     @param wt The weight of the policy holder
   */
   public Policy(int num, String name, String fst, String lst, int age, String stat, double ht, double wt)
   {
      policyNum = num;
      providerName = name;
      firstName = fst;
      lastName = lst;
      holderAge = age;
      smokeStatus = stat ;
      height = ht;
      weight = wt;
   }
// --------------Setter Methods--------------------
   /**
     setPolicyNum
     @param num The policyNumber
   */
   public void setPolicyNum(int num)
   {
      policyNum = num;
   }

   /**
     setPolicyNum
     @param name The provider's name
   */
   public void setProviderName(String name)
   {
      providerName = name;
   }

   /**
     setFirstName
     @param fst The policy holder's first name
   */
   public void setFirstName(String fst)
   {
      firstName = fst;
   }

   /**
     setLastName
     @param lst The policy holder's last name
   */
   public void setLastName(String lst)
   {
      lastName = lst;
   }

   /**
     setAge
     @param age The policy holder's age
   */
   public void setAge(int age)
   {
      holderAge = age;
   }

   /**
     setStatuse
     @param stat The smoking status of the policy holder
   */
   public void setSmokeStatuse(String stat)
   {
      smokeStatus = stat;
   }

   /**
     setHeight
     @param ht The policy holder's height
   */
   public void setHeight(double ht)
   {
      height = ht;
   }

   /**
     setWeight
     @param wt The policy holder's weight
   */
   public void setWeight(double wt)
   {
      weight = wt;
   }

//----------getter methods------
   /**
     getPolicyNum
     @return policyNumber
   */
   public int getPolicyNum()
   {
      return policyNum;
   }

   /**
     getPolicyNum
     @return provider's name
   */
   public String getProviderName()
   {
      return providerName;
   }

   /**
     getFirstName
     @return policy holder's first name
   */
   public String getFirstName()
   {
      return firstName;
   }

   /**
     getLastName
     @return policy holder's last name
   */
   public String getLastName()
   {
      return lastName;
   }

   /**
     getAge
     @return policy holder's age
   */
   public int getAge()
   {
      return holderAge;
   }

   /**
     getStatuse
     @return smoking status of the policy holder
   */
   public String getSmokeStatuse()
   {
      return smokeStatus;
   }

   /**
     getHeight
     @return policy holder's height
   */
   public double getHeight()
   {
      return height;
   }

   /**
     getWeight
     @return policy holder's weight
   */
   public double getWeight()
   {
      return weight;
   }

//--------------------------------------
   /**
      getBMI
      @return the BMI calulation 
   */
   public double getBMI()
   {
      return (weight*703)/Math.pow(height,2.0);
   }

   /**
      getPrice
      @return price of the insurance policy
   */
   public double getPrice()
   {
      double fee = 600.0;
      //age over 50, fee add 75
      if (holderAge>50)
      {
         fee += 75;
      }
      //smoker, fee add 100
      if(smokeStatus.equalsIgnoreCase("Smoker"))
      {
         fee += 100;
      }
      //BMI over 35, fee add (BMI-35)*20 
      if(getBMI() > 35)
      {
         fee += (getBMI()-35)*20;
      }
      return fee;
   }

}
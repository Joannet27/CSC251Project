public class Policy
{
   private int policyNum;
   private String providerName;
   private PolicyHolder info; //aggregation
   
   /**
     no-arg constructor that set default values to all the fields
   */
   public Policy()
   {
      policyNum = 0;
      providerName = "";
   }
   
   //--------------------------------------------------------------
   /**
     constructor that accepts necessary args
     @param num the policy number
     @param name The name of the provider
     @param data The PolicyHolder
     */
     
   public Policy(int num, String name, PolicyHolder data)
   {
      policyNum = num;
      providerName = name;
      info = data; // place holder b/c its the bad way
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
     getHolderInfo
     @return provider's name
   */
   public PolicyHolder getHolderInfo()
   {
      return info;//place holder
   }

}
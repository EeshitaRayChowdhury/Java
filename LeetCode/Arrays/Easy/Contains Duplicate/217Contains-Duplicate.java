class Solution {
    public boolean containsDuplicate(int[] nums) {
      //Condition:- Array is empty.
         if(nums.length==0 || nums == null)
            return false;
      
      //Brute Force Method - Time Complexity (O(n^2)) {Because 2 times loop}
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j]){
             
                    return true;
                }   
            }
           
        }
        
         return false;
        
       // Using Set -  Since the requirement is to have only unique values.
        
        Set<Integer> hs = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
            {
            return true;
            }
            
            hs.add(nums[i]);
            
        }
        return false; 
    }
}


import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int min = nums.get(0);
        int max = nums.get(0);
  
        // store the length of the ArrayList in variable n
        int n = nums.size();
  
        // loop to find minimum from ArrayList
        for (int i = 1; i < n; i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
  
        // loop to find maximum from ArrayList
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }

      
          
           return max-min;
 
      

}
}

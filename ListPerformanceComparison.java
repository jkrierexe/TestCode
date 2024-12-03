
import java.util.*;

public class TwoSum{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            maps.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int c = target-nums[i];
            if(hMap.containsKey(c) && hMap.get(c) != i){
                return new int[]{i, hMap.get(c)}
            }
        }
        return new int[0];
    }
}
            

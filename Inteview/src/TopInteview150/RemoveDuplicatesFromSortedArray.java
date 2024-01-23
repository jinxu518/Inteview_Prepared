package TopInteview150;

/**
 * @Author Jinxu Zheng
 * @Date 1/22/2024
 **/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j= 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[++j]=nums[i];
            }
        }
        return j+1;
    }
}

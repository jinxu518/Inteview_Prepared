package TopInteview150;

/**
 * @Author Jinxu Zheng
 * @Date 1/24/2024
 **/

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[]args){
        int[] ints = {1, 1, 1, 2, 2, 3};
        int i = removeDuplicates(ints);
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
        int j = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

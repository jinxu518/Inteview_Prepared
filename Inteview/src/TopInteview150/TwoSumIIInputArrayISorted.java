package TopInteview150;

/**
 * @Author Jinxu Zheng
 * @Date 7/6/2024
 **/
public class TwoSumIIInputArrayISorted {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int total = numbers[left] + numbers[right];
            if (total == target) {
                return new int[]{left + 1, right + 1};
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }
}

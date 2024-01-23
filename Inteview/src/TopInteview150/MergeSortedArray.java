package TopInteview150;

import java.util.Arrays;

/**
 * @Author Jinxu Zheng
 * @Date 1/22/2024
 **/
public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1, 3, 6, 0, 0, 0}, 3, new int[]{2, 3, 5}, 3);
    }

    // public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int i = m;
    //     for (int x = 0; x < n; x++) {
    //         nums1[i++] = nums2[x];
    //     }
    //     Arrays.sort(nums1);
    // }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
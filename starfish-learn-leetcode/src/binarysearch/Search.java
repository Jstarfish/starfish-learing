package binarysearch;

/**
 * @author Henry
 * @date 2022/3/14
 */
public class Search {

    public static int getResult(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,4,4,5,7,8};
        System.out.println(getResult(nums,4));
        System.out.println(getLeftNums(nums,4));
    }

    //左边界
    public static int getLeftNums(int[] nums,int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

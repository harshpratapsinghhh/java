import java.util.Arrays;

// Two-pointer implementation
public class RevEvenNum {
    public static int[] reverseEvenNumbers(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            while(left < right && nums[left] % 2 != 0) {
                left++;
            }
            while(left < right && nums[right] % 2 != 0) {
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Nums: " + Arrays.toString(reverseEvenNumbers(arr)));
    }
}
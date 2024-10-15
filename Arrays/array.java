package JavaDSA.Arrays;


public class array {
    //arrays are static in size
    public static void main(String[] args) {
        
    int[] nums = {1,2,3,4,5,6,7};
    // int k = 3;
    // rotate(nums,k);
    rotate(nums,3);

    for(int i:nums){
        System.out.println(i);
    }


    }
    
    public static void reverseSection(int[] nums, int startIndex, int endIndex){
        int start = startIndex;
        int end = endIndex;

        while(start < end){
            //swapping
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
    }
    // array rotation
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int lastIndex = len - 1;

        //reverse the array
        reverseSection(nums, 0, lastIndex);

        // reverse the first k elements
        reverseSection(nums, 0, k-1);

        //reverse the rest of the array
        reverseSection(nums, k, lastIndex);
    }
    
}

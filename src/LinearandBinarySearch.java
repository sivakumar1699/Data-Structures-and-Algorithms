
//Linear Search and Binary Search
public class LinearandBinarySearch {
    public static void main(String args[]){
        int nums[]={5,7,9,11,13};
        int target=13;
        int result=LinearSearch(nums,target);
        //int result1=BinarySearch(nums,target);
        if(result!=-1){
            System.out.println("Element found at "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static int LinearSearch(int[] nums, int target) {
        int steps=0;
        for(int i=0;i<nums.length;i++){
            steps++;
            if(nums[i]==target){
                System.out.println("Steps taken by linear search: "+steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear search: "+steps);
        return -1;
    }
    public static int BinarySearch(int[] nums, int target) {
        int steps=0;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            steps++;
            int mid=(left+right)/2;
            if(nums[mid]==target) {
                System.out.println("Steps taken by binary search: "+steps);
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else
                right=mid-1;
        }
        System.out.println("Steps taken by binary search: "+steps);
        return -1;
    }
}

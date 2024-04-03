public class habr_task6 {
    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == val){
                offset++;
            } else{
                nums[i - offset] = nums[i];
            }
        }

        int[] newArray = new int[nums.length - offset];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = nums[i];
        }
        return newArray;
    }
}

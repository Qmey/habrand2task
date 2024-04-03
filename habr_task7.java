public class habr_task7 {
    public static int[] removeElement(int[] nums, int val) {
        int count = 0;

        // Сначала вычислим длину нового массива
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int offset = 0;

        // Далее всё как в прошлых решениях,
        // только запись идёт в новый массив
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == val){
                offset++;
            } else{
                newArray[i - offset] = nums[i];
            }
        }

        return newArray;
    }
}

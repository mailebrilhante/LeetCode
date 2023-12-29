public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];

        for (int index = 0; index <= nums.length-1; index++){
            for (int secIndex =0; secIndex <= nums.length; secIndex++){
                if (index != secIndex && nums[index] + nums[secIndex] == target) {
                    indices[0] = index;
                    indices[1] = secIndex;
                }
            }
        }
        return indices;
    }
}

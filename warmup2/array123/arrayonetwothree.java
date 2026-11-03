public class arrayonetwothree {
  public boolean array123(int[] nums) {
    boolean result = false;

    for (int i = 2; i < nums.length; i++) {
      if (nums[i - 2] == 1 && nums[i - 1] == 2 && nums[i] == 3) {
        result = true;
      }
    }

    return result;
  }
}

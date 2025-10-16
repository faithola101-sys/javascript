public class ReverseNumber {
public static void main(String[] args) {

int[] nums = {1,0};

for(int i = 1; i < nums.length; i = i - 1) {
  if (i < 0) {
    break;
   }
System.out.println(nums[i]);
  

  }
 }
}
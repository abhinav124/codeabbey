public class MedianOfThree {

    public static void main(String[] args) {
        String[] input = Utils.getInputLines();
        String results = "\nanswer\n";
        for (int i = 0; i < input.length; i++) {
            String[] numsStr = input[i].split(" ");
            int[] nums = new int[numsStr.length];
            for (int j = 0; j < numsStr.length; j++) {
                nums[j] = Integer.parseInt(numsStr[j]);
            }
            results += medianOfThree(nums[0], nums[1], nums[2]);
            
            if (i<input.length-1) {
                results += " ";
            }
        }
        
        System.out.println(results);
    }
    
    public static int medianOfThree(int num1, int num2, int num3) {
        int swap;
        
        if (num1 > num3) {
            swap = num1;
            num1 = num3;
            num3 = swap;
        }
        
        if (num2 > num3) {
            swap = num2;
            num2 = num3;
            num3 = swap;
        }
        
        if (num1 > num2) {
            swap = num1;
            num1 = num2;
            num2 = swap;
        }
        
        return num2;
    }
}

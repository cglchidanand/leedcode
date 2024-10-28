public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 0, 4};
        int waterTrapped = trapWater(arr);
        System.out.println("Water trapped: " + waterTrapped);
    }

    public static int trapWater(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; 
        }

        int left = 0, right = arr.length - 1;
        int leftMax = 0, rightMax = 0;
        int totalWater = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left]; 
                } else {
                    totalWater += leftMax - arr[left]; 
                }
                left++; 
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    totalWater += rightMax - arr[right]; 
                }
                right--;
            }
        }

        return totalWater;
    }
}

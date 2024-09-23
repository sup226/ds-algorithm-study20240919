package Array;

public class twoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int targetSum = 5;
        int start = 0, end = 0, sum = 0, count = 0;

        while (end < arr.length) {
            if (sum == targetSum) {
                count++;
                sum += arr[end++];
            } else if (sum > targetSum) { // 합이 목표값보다 크다면
                sum -= arr[start++];
            } else { // 합이 목표값보다 작다면
                sum += arr[end++];
            }
        }
        System.out.println("부분합이 " + targetSum + "인 구간의 수: " + count);
    }
}

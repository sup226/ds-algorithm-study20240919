package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution2018 {
    public static void main(String[] args) throws IOException {
        // twoPointer
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        int start = 0, end = 0, count = 0, sum = 1;

        while (end < N) {
            if (sum == N) {
                count++;
                end++;
            } else if (sum > N) {
                sum -= arr[start];
                start++;
            } else {
                end++;
                sum += arr[end];
            }
        }
        System.out.println(count);
    }
}

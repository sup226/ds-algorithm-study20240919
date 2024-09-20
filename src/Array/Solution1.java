package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        Integer[] numArr = new Integer[N];
        for (int i = 0; i < arr.length; i++) {
        numArr[i] = Integer.parseInt(String.valueOf(arr[i]));
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 1; j < arr.length; j++) {
            if (numArr[j] > numArr[j-1]) {
                sb.append(numArr[j]);
            }
        }
        System.out.println(arr.length);

        System.out.println(sb);
    }
}

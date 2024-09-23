package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정열(오름차순)
        Arrays.sort(arr);

        int start = 0;
        int end = N-1;
        int total = 0;
        int count = 0;

        while (start < end) {
            total = arr[start] + arr[end];
            if (total < M) { // 우리의 합계(total)가 타겟 합계(M)보다 작은 경우
                start++;
            } else if (total == M) { // 우리의 합계(total)가 타겟 합계(M)와 같은 경우
                count++;
                start++;
                end--;
            } else { // 우리의 합계(total)가 타겟 합계(M)보다 큰 경우
                end--;
            }
        }

        System.out.println(count);

        br.close();
    }
}

package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution4 {
    // 소수 판별 로직(구식)
    public static boolean isPrime(int num) {
        if (num == 1) {
            return false; // 소수 아님
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // 소수 아님
            }
        }
        return true; // 소수임
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j : arr) {
            int temp = j;
            int result = 0;
            while (temp > 0) {
                int t = temp % 10;
                result = result * 10 + t;
                temp = temp / 10;
            }
            if (isPrime(result)) {
                System.out.print(result + " ");
            }
        }
        br.close();
    }
}

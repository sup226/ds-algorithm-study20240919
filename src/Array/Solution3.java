package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputA = br.readLine().split(" ");
        String[] inputB = br.readLine().split(" ");

        int[] arrA = new int[N];
        int[] arrB = new int[N];

        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(inputA[i]);
            arrB[i] = Integer.parseInt(inputB[i]);
        }

        for (int j = 0; j < N; j++) {
            if (arrA[j] == arrB[j]) {
                System.out.println("D");
                continue;
            }
            if ((arrA[j] == 1 && arrB[j] == 2) || (arrA[j] == 2 && arrB[j] == 3) || (arrA[j] == 3 && arrB[j] == 1)) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }



    }
}

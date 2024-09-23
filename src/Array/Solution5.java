package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] grid = new int[N][N];

        // 입력값을 배열에 저장
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxSum = Integer.MIN_VALUE;
        // 각 행, 각 열의 합을 계산
        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += grid[i][j]; // i번째 행의 값
                colSum += grid[j][i]; // i번째 열의 값
            }
            maxSum = Math.max(maxSum, rowSum);
            maxSum = Math.max(maxSum, colSum);
        }

        // 두 대각선의 합을 계산
        int diagonal1Sum = 0;
        int diagonal2Sum = 0;

        //  00 11 22 33 44
        // 04 13 22 31 40
        for (int i = 0; i < N; i++) {
            diagonal1Sum += grid[i][i];
            diagonal2Sum += grid[i][N-1-i];
            maxSum = Math.max(maxSum, diagonal1Sum);
            maxSum = Math.max(maxSum, diagonal2Sum);
        }

        System.out.println(maxSum);

//        int maxSum = Integer.MIN_VALUE;
//
//        for (int i = 0; i < N; i++) {
//            int rowSum = 0;
//            for (int j = 0; j < N; j++) {
//                rowSum += grid[i][j];
//            }
//            maxSum = Math.max(maxSum, rowSum);
//        }
//
//        for (int j = 0; j < N; j++) {
//            int colSum = 0;
//            for (int i = 0; i < N; i++) {
//                colSum += grid[i][j];
//            }
//            maxSum = Math.max(maxSum, colSum);
//        }
//
//        int diagSum = 0;
//        for (int i = 0; i < N; i++) {
//            diagSum += grid[i][i];
//        }
//        maxSum = Math.max(maxSum, diagSum);
//
//        int antiDiagSum = 0;
//        for (int i = 0; i < N; i++) {
//            diagSum += grid[i][N - 1 - i];
//        }
//        maxSum = Math.max(maxSum, antiDiagSum);
//
//        System.out.println(maxSum);
    }
}

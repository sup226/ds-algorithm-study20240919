package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];
        int max = 0; // 최대 행의 길이가 몇인지를 파악하기 위해.

        // 입력값 처리.
        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();

            // 가장 큰 배열의 행까지
            if (max < str.length()) max = str.length();

            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        
        // 2차원 배열을 열로 읽자.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == '\0') continue;
                sb.append(arr[j][i]);
            }
        }

        System.out.println(sb);
        br.close();
    }
}

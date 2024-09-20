package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("정수의 개수를 입력하세요 (1 <= N <= 100): ");
        int N = Integer.parseInt(br.readLine());

        // N의 범위 체크
//        if (N < 1 || N > 100) {
//            System.out.println("N은 1 이상 100 이하의 값이어야 합니다.");
//            return;
//        }

        int[] numbers = new int[N];
//        System.out.println("정수 " + N + "개를 입력하세요:");
        String[] input = br.readLine().split(" ");

        // 입력값을 배열에 저장
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

//        StringBuilder sb = new StringBuilder();
//        sb.append(numbers[0]).append(" ");
        int count = 1;
        int max = numbers[0];
        for (int j = 1; j < N; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
                count++;
            }
//                sb.append(numbers[j]).append(" ");

        }

        // 결과 출력
        System.out.println(count);
//        if (sb.length() > 0) {
//            System.out.println("바로 앞 수보다 큰 수: " + sb.toString().trim());
//        } else {
//            System.out.println("바로 앞 수보다 큰 수가 없습니다.");
//        }
    }
}

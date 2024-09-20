package string;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Solution2 {

    public static void solution(String[] arr) {
        for (String s : arr) {
            String newStr = new StringBuilder(s).reverse().toString();
            System.out.println(newStr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 코딩테스트에서는 문제대로 변수 줌

        if (N<3 || N>20) {
            return;
        }

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        solution(arr);



    }
}

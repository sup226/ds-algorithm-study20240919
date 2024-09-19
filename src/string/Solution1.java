package string;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        // 첫 입력 문자열에 c가 몇 개가 있나요?

        // 입력: Computercooler c
        // 출력: 2

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        // 일괄 대문자 변경
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        // 방법 1.
        int count = 0;
        for (char x : str.toCharArray()) {
            if (x == c) count++;
        }

        // 방법 2.
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == c) {
//                count++;
//            }
//        }

        System.out.println(count);
    }
}

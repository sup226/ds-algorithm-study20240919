package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String ans = "";
        int cnt = 1;
        ans += input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                if (cnt > 1) {
                    ans += cnt;
                }
                ans += input.charAt(i);
                cnt = 1;
            } else {
                cnt++;
            }
        }
            System.out.println(ans);
    }
}
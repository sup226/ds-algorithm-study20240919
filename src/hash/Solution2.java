package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        Map<Character, Integer> map = new HashMap<>(); // HashMap

        for (char c : str1.toCharArray()) { // str1의 단일 문자가 하나씩 c로 전달됨
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        String answer = "YES";
        if (str1.length() != str2.length()) answer = "NO";

        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                answer = "NO";
                break;
            }
            map.put(c, map.get(c) - 1);
        }

        System.out.println(answer);

        br.close();


    }
}

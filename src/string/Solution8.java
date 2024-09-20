package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        BufferedReader code = new BufferedReader(new InputStreamReader(System.in));
        String str = code.readLine();

        for (int i = 0; i < num; i++) {
            String str_substring = str.substring(i*7, i*7+7);
            char key = (char) Integer.parseInt(str_substring,2);
            System.out.print(key);
        }
    }
}

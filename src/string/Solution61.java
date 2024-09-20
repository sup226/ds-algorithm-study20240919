package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution61 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // 공백 띄우고 입력받기 방법 1.
        // String str = sc.nextLine();
        // String[] arr = str.split(" ");

        // 공백 띄우고 입력받기 방법 2.
//        String str = sc.next();
//        String t = sc.next();

        // 공백 띄우고 입력받기 방법 3.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 예외처리(throws)

    }
}

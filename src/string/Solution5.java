package string;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        StringBuilder copy = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                copy.append(str.charAt(i));
            }
        }
        String reversed = new StringBuilder(copy.toString()).reverse().toString();
        System.out.println(reversed);
        if(reversed.contentEquals(copy)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

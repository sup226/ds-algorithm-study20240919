package string;

import java.util.Scanner;

public class Solution51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
//            System.out.println(c);
//            System.out.println(Character.isLetter(c));
            if (Character.isLetter(c)) {
            sb.append(c);
            }
        }

        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

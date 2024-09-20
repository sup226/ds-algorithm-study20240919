package string;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if(!answer.contains(String.valueOf(str.charAt(i)))) {
                answer += str.charAt(i);
            }
        }
        System.out.println(answer);
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//            for (int i = 0; i < str.length(); i++) {
//                if(str.indexOf(str.charAt(i)) == i) {
//                    str += str.charAt(i);
//                }
//
//            }
//        String newStr = String.valueOf(str);
//        System.out.println(newStr);
//        sc.close();
//    }
}

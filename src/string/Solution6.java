package string;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        String c = sc.next();
        int size = temp.length();
        int left[] = new int[size];
        int right[] = new int[size];
        int l = 1;
        int r = 1;
        for (int i = 0; i < size; i++) {
            if (temp.charAt(i) == c.charAt(0)) {
                l = 0;
            }
            left[i] = l++;
        }
        for (int i = size - 1; i >= 0; i--) {
            if (temp.charAt(i) == c.charAt(0)) {
                r = 0;
            }
            right[i] = r++;
        }

        int ans[] = new int[size];
        for (int i = 0; i < ans.length; i++) {
            int k = Math.min(left[i], right[i]);
            ans[i] = k;
        }
        String result = "";
        for (int i = 0; i < ans.length; i++) {
            result += ans[i];
        }
        System.out.println(result);





    }

//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        s = s.toLowerCase();
//        char[] arr = s.toCharArray();
//        char t = sc.next().charAt(0);
//
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//            for (char c : arr) {
//                if (arr.indexOf(arr.charAt(i)) == t) {
//                    System.out.println(arr[i]);
//            }
//            }
//        }
    }


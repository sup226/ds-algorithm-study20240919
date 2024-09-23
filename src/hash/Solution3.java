package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " "); // 입력한 값을 공백을 기준으로 구분을 해줘라
        int N = Integer.parseInt(st.nextToken()); // K번째 합
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " "); // 다음 줄에 입력한 값을 공백을 기준으로 구분을 해줘라
        int[] arr =  new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // tree set
        // 1. set 인터페이스 (Hash와 마찬가지)
        // list를 쓰면 중복불허용 로직을 새로 써야하는데 tree set은 중복불허용 로직을 따로 안 써도 됨
//        Set<Integer> tSet = new TreeSet<>(); 오름차 tree set
        Set<Integer> tSet = new TreeSet<>(Comparator.reverseOrder()); // 내림차 tree set

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    tSet.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
    }
}

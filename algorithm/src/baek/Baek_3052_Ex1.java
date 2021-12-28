package baek;

import java.io.*;
import java.util.HashSet;

public class Baek_3052_Ex1 {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        HashSet<Integer> remainderSet = new HashSet<>();//Set 클래스는 중복을 자동으로 제거해준다
        for(int i=0; i<10; i++){
            int input = Integer.valueOf(br.readLine());
            remainderSet.add(input%42);
        }
        System.out.println(remainderSet.size());
    }
}
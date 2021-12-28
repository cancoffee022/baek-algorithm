package baek;

import java.io.*;

public class Baek_8958_Ex1{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        String[] arr = new String[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }
        
        for(int i = 0; i < arr.length; i++){
            int series = 0;
            int sum = 0;
            
            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].charAt(j) == 'O'){//charAt()은 String으로 저장된 문자열 중에서 한글자만 선택해서 char타입으로 변환한다
                    series++;
                }else{
                    series = 0;
                }
                sum += series;
            }
               sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
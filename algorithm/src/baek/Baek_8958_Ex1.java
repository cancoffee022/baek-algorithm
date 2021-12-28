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
                if(arr[i].charAt(j) == 'O'){//charAt()�� String���� ����� ���ڿ� �߿��� �ѱ��ڸ� �����ؼ� charŸ������ ��ȯ�Ѵ�
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
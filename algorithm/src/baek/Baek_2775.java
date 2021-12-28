package baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_2775 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] arr=new int[15][14];
		
		for(int i=0;i<14;i++) {//0ÃþÀÇ iÈ£¿¡´Â i¸íÀÌ »ê´Ù
			arr[0][i]=i+1;
		}
		
		for(int j=1;j<15;j++) {//jÃþ iÈ£
			for(int i=0;i<14;i++) {
				for(int l=0;l<=i;l++) {
					arr[j][i]+=arr[j-1][l];
				}
			}
		}
		
		int T=Integer.parseInt(br.readLine());
		
		for(int x=0;x<T;x++) {
			int k=Integer.parseInt(br.readLine());//Ãþ
			int n=Integer.parseInt(br.readLine());//È£
			
			bw.write(arr[k][(n-1)]+"\n");
			
		}
		bw.close();
	}

}

package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_5622 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		int[] arr=new int[8];
		int sec=0;
		
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)){
			case 65:
			case 66:
			case 67:
				arr[0]++;
				break;
			case 68:
			case 69:
			case 70:
				arr[1]++;
				break;
			case 71:
			case 72:
			case 73:
				arr[2]++;
				break;
			case 74:
			case 75:
			case 76:
				arr[3]++;
				break;
			case 77:
			case 78:
			case 79:
				arr[4]++;
				break;
			case 80:
			case 81:
			case 82:
			case 83:
				arr[5]++;
				break;
			case 84:
			case 85:
			case 86:
				arr[6]++;
				break;
			case 87:
			case 88:
			case 89:
			case 90:
				arr[7]++;
				break;	
			}
		}
		for(int i=0;i<8;i++) {
			sec+=(i+3)*arr[i];
		}
		
		System.out.print(sec);
	}

}

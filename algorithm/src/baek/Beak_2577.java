package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak_2577 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		
		int sum=a*b*c;
		int k=100;
		int j=0;
		int num0=0,num1=0,num2=0,num3=0,num4=0,num5=0,num6=0,num7=0,num8=0,num9=0;
		
		int arr[]=new int[10];//배열의 크기가 10인 이유는 최대값인 1000의 3승이 10자리까지만 나오기 때문에
		
		for(int i=0;i<10;i++) {
			if(sum<Math.pow(10, i)) {//나누는 수보다 sum이 작으면 배열에 -1값을 집어넣고 break시킴
				for(;i<10;i++)
					arr[i]=-1;
				break;
			}
				
			while(k>10) {//sum값에 10의 i+1승 만큼 나머지를 구하고 나머지값에서 10의 i승만큼 나눠주면 각 i자리수가 k값에 저장됨
				k=(int) ((sum%Math.pow(10,i+1-j))/Math.pow(10, i));
				j++;
			}
			arr[i]=k;
			k=100;
			j=0;
		}//배열에 k값을 저장시키고 k j등 변수들을 초기화
		for(int i=0;i<arr.length;i++) {//스위치 문을 만들어서 배열의 값을 검사시킴
			switch(arr[i]) {
			case 0:
				num0++;
				break;
			case 1:
				num1++;
				break;
			case 2:
				num2++;
				break;
			case 3:
				num3++;
				break;
			case 4:
				num4++;
				break;
			case 5:
				num5++;
				break;
			case 6:
				num6++;
				break;
			case 7:
				num7++;
				break;
			case 8:
				num8++;
				break;
			case 9:
				num9++;
				break;
			}
		}
		System.out.println(num0);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
//		for(int i=0;i<arr.length;i++)
//			System.out.print(arr[i]+" ");
	}
}


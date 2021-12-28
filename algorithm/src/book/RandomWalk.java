package book;

public class RandomWalk {

	public static void main(String[] args) {
		
		boolean[][] arr=new boolean[10][10];
		
		int x=4,y=4;
		
		for(int i=0;i<9;i++) {
			arr[x][y]=true;
			int dir=(int)(Math.random()*4);
		
			if(dir==0&&x<9)
				x++;
			else if(dir==1&&x>0)
				x--;
			else if(dir==2&&y>0)
				y--;
			else if(y<9)
				y++;
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(arr[i][j])
					System.out.print("#");
				else
					System.out.print(".");
			}
			System.out.println();
		}
	}

}



import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			wuzi();
	}
	public static void wuzi(){
		char[][] arr = new char[15][30];
		for(int i = 0;i < 15;i++){
			for(int j = 0;j < 30;j++){
				arr[i][j] = '☆';
			}
		}
		//打印棋盘
		dayin(arr);
		while(true){		
			shuru(arr);			
	}
}
		public static void dayin(char arr[][]){
			for(int i = 0;i < 15;i++){
				for(int j = 0;j < 30;j++){
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
		public static void shuru(char arr[][]){	
	
			System.out.println("请输入落子的坐标(行，列)::");
			Scanner sc = new Scanner(System.in);
			int line = sc.nextInt()-1;
			int row = sc.nextInt()-1;
			 if(arr[line][row] == '■'||arr[line][row] == '★'){
				   System.out.println("该位置已有子请重新输入::");				
				    line = sc.nextInt()-1;
				    row = sc.nextInt()-1;
			 }
			     	arr[line][row] = '■';
			    	dayin(arr);
					if(pd(arr,line,row,'■')){
						System.out.println("你赢了");
						return;
					
			 }
			System.out.println("输入你落子的坐标 (行，列)::");
			 line = sc.nextInt()-1;
			 row = sc.nextInt()-1;
			 if(arr[line][row] == '■'||arr[line][row] == '★'){
				 System.out.println("该位置已有子请重新输入::");	
				 line = sc.nextInt()-1;
				 row = sc.nextInt()-1;
			  }
					arr[line][row] = '★';
					dayin(arr);
					if(pd(arr,line,row,'★')){
						System.out.println("你赢了");
						return;					 
					}
			}
		public static boolean pd(char arr[][],int line,int row,char ch){
			boolean flag = false;
			int count = 0;
			//横向
			for(int i = 1;i < 5;i++){
				if((row + i<30)&&arr[line ][row+i]==ch){
						count++;	
				}
				if((row - i>=0)&&arr[line ][row-i]==ch){
						count++;				
				} 
				if(count==4)
				flag = true;
			}
			//纵向
			count = 0; 
			for(int i = 1;i < 5;i++){
				if((line + i<15)&&arr[line + i][row]==ch){
						count++;	
				}
				if((line - i>=0)&&arr[line - i][row]==ch){
						count++;				
				} 
				if(count==4)
				flag = true;
			}
			//对角线
			count = 0; 
			for(int i = 1;i < 5;i++){
				if((row + i<30)&&(line + i<15)&&arr[line + i][row+i]==ch){
						count++;	
				}
				if((row - i>=0)&&(line - i>=0)&&arr[line - i][row-i]==ch){
						count++;				
				} 
				if(count==4)
				flag = true;
			}
			count = 0; 
			for(int i = 1;i < 5;i++){
				if((row + i<30)&&(line - i>0)&&arr[line - i][row+i]==ch){
						count++;	
				}
				if((row - i>=0)&&(line + i <15)&&arr[line + i][row-i]==ch){
						count++;				
				} 
				if(count==4)
				flag = true;
			}
			
			return flag;
		}
}


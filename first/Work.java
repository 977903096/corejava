import java.util.Scanner;
public class Work
{
		public static void main(String argc[]){
				jiu();
		}
		//求最大公约数与最大公倍数
	public static void gg(){
		for(int i = 18;i > 0;i--) {
			if(18%i==0&&27%i==0){
				System.out.println("18和27的最大公约数是"+i);
				break;
			}
		}
		for(int i=27;;i++){
			if(i%27==0&&i%18==0){
				System.out.println("18和27的最小公倍数是"+i);
				break;
			}
		}
	}
		//第六题
		public static int liu(){
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int sum = 0;
			int temp = 0;
			for(int i = 0;i<5;i++){
				
				    temp+=num;
					num*=10;
					System.out.print(temp+"  ");
					sum+=temp;
					
			}
			System.out.print("sum="+sum);
			return 0;
		}
		//第七题
		public static void qi(){
			double sum = 0.0;
			double temp = 0.0;
			double n = 2.0;
			double m =1.0;	
			double x;
			int i = 1;
				while(i<21){
						temp = n/m;
						System.out.print(temp+"\t");
						sum+= temp;
						x = n;
						n = n+m;
						m = x;
						i++;
				}
				System.out.print("sum="+sum);
		}
		//第9题
		public static void jiu(){
		int n = 5;
		for(int i = 0;i<n;i++){
				for(int j = 1;j<n-i;j++){
						System.out.print(" ");
				}
				System.out.print(1);
				int temp = 2;
				for(int j = 0;j<i -1;j++){
					System.out.print(temp);
						temp*=2;						
				 }
				 for(int j = i;j>=0;j--){							
						System.out.print(temp);	
						temp/=2;
				 }					 				
				System.out.println(); 
		}			
	}
		//第十题
		public static void shi(){
		int[][]  arr = new int[][]{{1,2,3},{4,5,6}};
		int[][] arr1 = new int[3][2];
			for(int i = 0;i < arr.length;i++){
				for(int j = 0;j<arr[i].length;j++){
					arr1[j][i]=arr[i][j];	
					System.out.print(arr[i][j]+" ");			
				}
				System.out.println();
			}
			System.out.println("************");
				for(int i = 0;i < arr1.length;i++){
					for(int j = 0;j<arr1[i].length;j++){
						System.out.print(arr1[i][j]+" ");				
					}
					System.out.println();
			}	
	}
	//第十一题
	public static void shiyi(){
		int[][] arr = new int[][]{{1,2,3},{4,5,6}};
		int[][] arr1 = new int[][]{{1,2,3},{4,5,6}};
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr[i].length;j++){
				arr[i][j] += arr1[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	//第十二题
	public static void shier(){
		int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int sum = 0;
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr[i].length;j++){
				if(i==j){					
					sum+=arr[i][j];
				}
			}
		}
		System.out.println("sum="+sum);
	}
	//第十三题
	public static void shisan(){
		int[][] arr = new int[][] { {1,2,3}, {4,5,6}};
		int[][] arr1 = new int[][] { {1,4},{2,5},{3,6}};
		int[][] arr3 = new int[10][10];
		int r = 0;
			for(int i = 0;i < arr.length;i++){
				for(int j = 0;j < arr1[0].length;j++){
					for(int n = 0;n < arr1.length;n++){					
							r += arr[i][n]*arr1[n][j];							
					}
					arr3[i][j] = r;
					r = 0;
					System.out.print(arr3[i][j]+" ");
				} 				
				System.out.println();
			}			
	}
	//第十五题
	public static void shiwu(){
		int [] arr = new int[]{9,6,7,8,93,4,65,63};
		for(int i = 0;i < arr.length-1;i++){
			for(int j = 0;j < arr.length-i-1;j++){
				if(arr[j+1]>arr[j]){
				int temp = arr[j+1];
				arr[j+1] = 	arr[j];
				arr[j] = temp;}		
			}		
		}
		for(int i = 0;i < arr.length;i++)
			System.out.print(arr[i]+"  ");
	}	
};
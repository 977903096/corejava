import java.util.Arrays;

class Worker{
	String name;
	String height;

	public Worker(String name,String height){
		this.name = name;
		this.height = height;
	}

	public Worker(){

	}

	public String toString(){
		return "姓名是："+name+",身高是："+height;
	}
}

public class TestMethod{
	public static void main(String[] args){

		Worker w = new Worker("呵呵","180");
		System.out.println(w);
		test4(w);
		System.out.println(w);
		
		/*int[] arr = new int[]{1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		test3(arr);//将main方法中arr的地址值赋值给形参arr
		System.out.println(Arrays.toString(arr));*/
		
		/*int a = 4;
		int b = 2;
		System.out.println(a+"\t"+b);
		test(a,b);
		System.out.println(a+"\t"+b);*/
	}
	public static void test4(Worker w){
		w.name = "小四";
		w = new Worker();		
		System.out.println(w);
	}
	public static void test3(int[] arr){
		arr[0] = 888;//此时形参和实参指向的是同一块堆区内存 就是对实参进行了修改
		arr = new int[]{3,4,5,6,78};//实参和形参不在指向同一块堆区内存，所以对形参的修改不会影响到实参
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println(Arrays.toString(arr));
	}
	//因为在方法体内形参和实参指向不是同一个堆区内存
	public static void test2(int[] arr){
		arr = new int[]{3,4,5,6,78};
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println(Arrays.toString(arr));
	}

	//对形参的修改影响实参 因为此时形参和实参指向的是同一块堆区内存
	public static void test(int[] arr){
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println(Arrays.toString(arr));
	}

	//一个方法的参数可以是任意类型  我们对形参的修改不会影响到实参
	public static void test(int a, int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a+"\t"+b);
	}



}

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
		return "�����ǣ�"+name+",����ǣ�"+height;
	}
}

public class TestMethod{
	public static void main(String[] args){

		Worker w = new Worker("�Ǻ�","180");
		System.out.println(w);
		test4(w);
		System.out.println(w);
		
		/*int[] arr = new int[]{1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		test3(arr);//��main������arr�ĵ�ֵַ��ֵ���β�arr
		System.out.println(Arrays.toString(arr));*/
		
		/*int a = 4;
		int b = 2;
		System.out.println(a+"\t"+b);
		test(a,b);
		System.out.println(a+"\t"+b);*/
	}
	public static void test4(Worker w){
		w.name = "С��";
		w = new Worker();		
		System.out.println(w);
	}
	public static void test3(int[] arr){
		arr[0] = 888;//��ʱ�βκ�ʵ��ָ�����ͬһ������ڴ� ���Ƕ�ʵ�ν������޸�
		arr = new int[]{3,4,5,6,78};//ʵ�κ��ββ���ָ��ͬһ������ڴ棬���Զ��βε��޸Ĳ���Ӱ�쵽ʵ��
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println(Arrays.toString(arr));
	}
	//��Ϊ�ڷ��������βκ�ʵ��ָ����ͬһ�������ڴ�
	public static void test2(int[] arr){
		arr = new int[]{3,4,5,6,78};
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println(Arrays.toString(arr));
	}

	//���βε��޸�Ӱ��ʵ�� ��Ϊ��ʱ�βκ�ʵ��ָ�����ͬһ������ڴ�
	public static void test(int[] arr){
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println(Arrays.toString(arr));
	}

	//һ�������Ĳ�����������������  ���Ƕ��βε��޸Ĳ���Ӱ�쵽ʵ��
	public static void test(int a, int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a+"\t"+b);
	}



}

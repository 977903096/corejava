package Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Oper {
	
	public static void oper(){
		LinkedList list = new LinkedList();
		list.add(new Student(1,"hh",12));
		list.add(new Student(2,"jj",13));
		list.add(new Student(3,"yy",15));
		
		while(true){
			System.out.println(list);
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			//查询
			if(num==1){
				System.out.println("请输入你要查询的学生id");
				int id = sc.nextInt();
				
				Iterator it = list.iterator();
				while(it.hasNext()){
					Student st = (Student)it.next();
					if(st.id==id){
						System.out.println(st.toString());
					}
				}
				System.out.println("==========");
				Ui.show();
			}
			
		//增加
			if(num==2){
				System.out.println("输入你要增加学生信息(id--name--age)");
				list.add(new Student(sc.nextInt(),sc.next(),sc.nextInt()));
				System.out.println(list.toString());
				System.out.println("=============");
				Ui.show();
			}
			
			//删除
			if(num==3){
				System.out.println("输入你要删除学生的id");
				int id = sc.nextInt();
				Student st1 = null;
				Iterator it = list.iterator();
				while(it.hasNext()){
					Student st = (Student)it.next();
					if(st.id==id){
						 st1 = st;
					}
				}
				list.remove(list.indexOf(st1));
				st1 = null;
				System.out.println(list.toString());
				System.out.println("=============");
				Ui.show();
			}
			
			//修改
			if(num==4){
				System.out.println("输入你要修改学生的id");
				int id = sc.nextInt();
				int count = 0;
				Iterator it = list.iterator();
				while(it.hasNext()){
					Student st = (Student)it.next();
					 count++;
					if(st.id==id){
						System.out.println("输入你要增加学生信息(id--name--age)");
						list.set(count-1,new Student(sc.nextInt(),sc.next(),sc.nextInt()));
					}
				}
				count=0;
				System.out.println(list.toString());
				System.out.println("=============");
				Ui.show();
			}
			
		}
	}
}

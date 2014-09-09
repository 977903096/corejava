public class Person{
	String id;
	String name;
	public void eat(){
		System.out.println("ÕıÔÚ³Ô");
		
	}
	public Person(String id){
		this.id = id;		
	}
	public Person(){}
		
	
}
class Student extends Person{
	int studyid;	
	
	public Student(int studyid){			
		this.studyid = studyid;		
	}
	public Student(){		
	}
	public String toString(){
		return "["+name+"\t"+studyid+"]";
	}
	
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		if(!(obj instanceof Student)){
			return false;
		}
		Student st = (Student)obj;
		if(studyid==st.studyid){
			return true;
		}
		return false;
	}

	/*public boolean equals(Student st){
		if(studyid==st.studyid){
			return true;
		}

		return false;
	}*/
}

class Test4{
	public static void main(String args[]){
		Object obj = new Student(1111);
		Object obj2 =obj;		
		System.out.println(obj.equals(obj2));
		
	}
}